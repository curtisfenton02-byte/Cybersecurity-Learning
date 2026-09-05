# What is a network?

A network is simply a group of devices that can communicate with each other. These devices include:

- Computer
- Phones
- Servers
- Printers
- Routers
- Virtual machines
- Security devices (e.g. firewalls)

The simplest example of a network would be two computers connected to each other. As long as they can share information between each other, this is classed as a network.

Computers are constantly sending and retrieving data from one another. This information exchange can include, but is not limited to:

- Text
- Images
- Files
- Login credentials
- Video
- Commands
- API requests
- Database information

## IP addresses

An IP address is an address used to identify a device or network interface within an IP network.

An example of an IPv4 address would be:

- 192.168.1.25

It consists of four numbers, separated by periods.

Each section is called an **octet** which can range from 0-255. This means that whilst **192.168.1.25** is valid, **192.168.1.300** is not because *300* is outside the allowed range.

## Private IP addresses

Individual devices have their own private IP addresses which aren't usually seen by the websites on the internet.

## Network Interfaces

A computer uses a network interface, such as an *Ethernet or Wi-Fi adapter* to connect with a network.

The network interface allows a device to send and receive network traffic.

These network interfaces can be identified on Linux and Windows operating systems as:

### Linux

- enp3s0
- wlp2s0

### Windows

- Ethernet
- Wi-Fi

A single computer can have multiple network interfaces, each connecting it to different networks.

## What is a host?

A host is a device participating in a network. Example of a host is:

- Laptop
- Server
- Desktop
- Phone
- Virtual machine

## Client and server

A client is the device or application making a request. Whereas, the server provides a service or responds to requests.

An example of each would be when we visit a website, our browser is acting as the **client** whilst the web server acts as the **server**. 

An alternative example, where the roles are reversed, would be if our PC was running an SSH server and another PC was connecting to it. In this case, our PC is acting as the server.

## What is a service?

A service is a program or network function that provides some functionality to other systems. For example, one server (the host) could be operating multiple services, such as:

- Web server
- SSH server
- SMB

## Ports

Even if we know a hosts IP address, we still wouldn't know what we can communicate with. This is why we need ports to tell the computer which service we're trying to contact.

A port is a numbered endpoint associated with network communication. 

Network devices also use ports to enforce strict rules when communicating with each other. When a connection is established, any data sent or received by a device will be transported through these ports. In computing, ports have a numerical value between 0 and 65,535.

- 192.168.1.50:22

This means that the destination is **192.168.1.50**, and we're communicating with port **22**.

### Common Ports

| Port | Common service |
|-----------|-----------|
|  21  | FTP |
|  22 | SSH   |
|  25  | SMTP  |
| 53  | DNS|
| 80 | HTTP |
| 443 | HTTPS |
| 445 | SMB |
| 3389 | RDP |

To be clear, these ports don't strictly have to be for these services. An administrator can decide to configure certain services to use different ports, if they choose. The above services commonly utilize these ports.

## TCP 

TCP stands for *Transmission Control Protocol* and is connection-oriented (requires connection). 

Before two machines begin normal communication, they must first establish a connection. This begins the TCP three-way handshake.

### TCP three-way handshake

1. SYN - The client sends a TCP packet with the SYN flag set to the server. This is essentially requesting a TCP connection.
2.  SYN/ACK - The server receives the client's packet and responds with a SYN/ACK. This is acknowledgment of the request and agreement to establish a connection.
3.  ACK - The client responds to the server with ACK (acknowledged) and the connection is established.

## UDP

Adversely, UDP stands for User Diagram Protocol and does not establish a connection using the TCP three-way handshake.

The client simply sends a UDP datagram to the server. This can be advantageous for certain applications, but can also cause problems for users. 

One example being that UDP doesn't provide useful acknowledgement information like TCP does, meaning that we can scan a port without actually knowing whether the service is actually listening. As a result, UDP scanning can be slower and more ambiguous than TCP scanning.

## Command Prompt Code

```bash
ipconfig
```

We will receive:

| Info | Meaning |
|-----------|-----------|
|  IPv4 Address  | the address assigned to our computer's interface on our network. |
|  Subnet Mask |    |
|  Default Gateway | normally the device our computer sends traffic to when it needs to communicate with destinations outside its local network.  |






