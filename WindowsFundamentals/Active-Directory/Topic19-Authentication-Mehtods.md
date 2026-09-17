# Authentication in Windows Domains

In an Active Directory domain, domain account information and the cyrptographic material required to authenticate those accounts are centrally maintained by Active Directory on Domain Controllers (DCs).

When a user accesses a network service using their domain identity, Windows uses an authentication protocol such as **Kerberos** or **NTLM** to verify the user's identity. The service can then use the authenticated identity when determining what the user is authorized to access.

## Kerberos Authentication

Kerberos is the preferred authentication protocol for modern Active Directory environments. Windows uses **Kerberos version 5**.

Rather than sending the user's password to each service for verification, Kerberos uses a **ticket-based system**. 

Every user that logs into a service using Kerberos will be assigned a ticket which acts as proof of a previous authentication. 

These are the steps used by Kerberos for authentication:

### Key Distribution Center

The KDC is the component responsible for Kerberos authentication and ticket issuance.

In an AD domain, the KDC runs a domain service on a Domain Controller and uses AD as its account database. The KDC provides two logical services:

1. Authentication Service
2. Ticket-Granting Service

### First Stage - Requesting a Ticket Granting Ticket

When a user signs into a domain, the Kerberos client on their computer needs to obtain a Ticket Granting Ticket (TGT).

The client sends a **KRB_AS_REQ** to the KDC. This is just the name of a particular Kerberos message:

- KRB: Kerberos
- AS: Authentication Service
- RED: Request

The request identifies the user and also contains **pre-authentication data**. With normal password-based authentication, this includes a timestamp encrypted using a secret key derived from the user's password.

The user's plaintext password is not sent to the KDC.

### The Key Distribution Center authenticates the user

Next the KDC checks the pre-authentication data against the user's account information in Active Directory. If the authentication is successful, the KDC creates two important things:

1. Ticket Granting Ticket
2. TGT Session Key

The KDC then returns these to the user's computer in a **KRB_AS_REP** response.

- KRB: Kerberos
- AS: Authentication Service
- REP: Reply

### Understanding the TGT

The TGT is not a ticket that allows the user to directly access every service on the network.

Instead, it proves to the KDC that the user has already authenticated and allows the user to request additional tickets.

This is why Kerberos doesn't require the user to repeatedly provide their password whenever they access another service.

### The TGT Session Key

The Key Distribution Center also creates a **session key** during the Authentication Service exchange.

There are two copies of this key:

1. Client's copy
2. Copy inside TGT

The user's machine receives an encrypted copy so that it can recover the key using the user's secret key.

Another copy of the session key is given to the TGT, which is itself already encrypted so that the client cannot read or modify its protected contents.

### What is the krbtgt account?

In an Active Directory domain, Kerberos uses the special **krbtgt** account for the ticket-granting service. 

The important concept is that the KDC has a secret key associated with this account.

When I mentioned earlier that the TGT is already encrypted, I specifically meant that it is encrypted with KDC's secret key.

### Why does the TGT contain the session key?

The TGT contains a copy of the TGT session key because the KDC will need that key later.

When the user's computer eventually presents the TGT to request another ticket, the KDC can decrypt the TGT and recover the session key.

This means the KDC can recover the necessary key from the TGT rather than having to separately receive it from the client.

The protocol specifically defines the ticket as containing a copy of the session key, protected by the server's secret key. 

## The user wants to access a service

Now suppose the user wants to access a service such as:

- File server
- Web server
- SQL Server
- RDP service

The user needs a **service ticket** specifically for that service.

Therefore, the client contacts the Key Distribution Center's **Ticket-Granting Service (TGT)** which provides this ticket.

### Service Principle Name (SPN)

Before requesting the service ticket, the client needs to identify the service they want to access.

This is achieved by using a SPN which identifies a particular service running under a particular account.

A SPN commonly appears as:

`service/hostname`

For example:

`HTTP/webserver.example.com`

Ultimately, the SPN allows AD/Kerberos to determine which account is associated with the requested service.

### Requesting a Ticket-Granting Service 

To request a TGS, the user sends their username and a timestamp encrypted using the Session Key, along with the TGT and a Service Principle Name to the KDC.

As a result, the KDC will send the user's computer a TGS along with a Service Session Key, which we will need to authenticate to the service we want to access.

The TGS is encrypted using a key derives from the **Service Owner Hash**. When I refer to the Service Owner, I mean the user or machine account that the service runs under.

The TGS contains a copy of the Service Session Key on its encrypted contents so that the Service Owner can access it by decrypting the TGS.

Finally, the TGS can then be sent to the desired service to authenticate and establish a connection. The service will use its configured account's password hash to decrypt the TGS and validate the Service Session Key.

**Screenshots of the Kerberos authentication service can be viewed in the WindowsFundamentals-Topic19-ScreenShot file**

## NetNTLM Authentication

NetNTLM operates using a challenge-response mechanism. Specifically the server gives the client a challenge, and the client produces a response based on the user's secret credential information.  It is not another form of Kerberos but an older NTLM authentication system. 

### Why do Windows domains have both authentication services?

The short answer is that Kerberos isn't always possible by the domain.

Expounding upon this, Windows commonly uses **Negotiate** when an application requests integrated Windows authentication. Negotiate attempts to select Kerberos, but can fall back to NTLM when Kerberos cannot be used.

One common reason why Kerberos can fail is that the target service doesn't have the information Kerberos needs to identify it properly, such as an appropriate SPN. 

The entire NetNTLM process is as follows:

1. The client sends an authentication request to the server they want to access.
2. The server generates a random number and sends it as a challenge to the client.
3. Then the client combines their NTLM password hash with the challenge (and other known data) to generate a response to the challenge and returns it to the server for verification.
4. Next the server forwards the challenge and the response to the Domain Controller for verification.
5. As a result, the Domain Controller uses the challenge to recalculate the response and compares it to the original response sent by the client. If they both match, the client is then authenticated. Otherwise, access it denied.
6. Finally, the server forwards the authentication result to the client.

The user's password (or hash) is never transmitted through the network for security purposes.

## What if a local account is used instead?

The previous description of NetNTLM only applies when the access request is performed by a domain account. However, if a local account is used, the server can instead verify the response to the challenge itself without requiring interaction with the domain controllers since it has the password hash stored locally on its Security Accounts Manager (SAM). 

