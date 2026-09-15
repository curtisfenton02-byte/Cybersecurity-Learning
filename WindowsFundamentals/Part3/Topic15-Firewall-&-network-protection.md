# Firewall & network protection

## What is a firewall?

A firewall is a security system that *monitors and controls network traffic entering and leaving a device or network*. It uses rules to determine which network connections are **allowed** or **blocked**, helping to prevent unauthorized access.

Network traffic enters and leaves devices through **network ports**. A firewall examines this traffic and decides whether it should be allowed to pass based on its configured rules.

## The three networks

For Windows Firewall, there are three network profiles that determine which firewall rules and security settings apply to a network connection.

| Profile | Description |
|--------|---------|
|Domain|Used when a computer is connected to a network associated with a **Windows domain**, such as an organization using Active Directory. This profile is intended for trusted organizational networks.|
|Private|Used for trusted networks, such as a home network. This profile allows features such as network discovery and file or printer sharing to be enabled more easily than on a public network.|
|Public|Used for untrusted networks, such as public Wi-Fi in coffee shops, airports, hotels, or any other locations. This profile applies stricter network security settings and generally limits network discovery and sharing.|

It is important to note that these profiles don't represent three different firewalls. Rather, Windows Firewall uses the profile assigned to the current network connection to determine which firewall rules apply.

By clicking on any of the three firewall profiles, the user will gain access to another screen, each of which containing only two options:

1. Turn the firewall on/off
2. Block all incoming connections

## Allow an app through firewall

A user can view the current settings for any firewall profile by clicking the *Allow an app through firewall* option.

The term *Allow* doesn't mean that the listed applications have unrestricted access to the computer or the internet. Instead, it means that Windows Firewall has a rule that permits the application to make certain network connections through the firewall.

These rules can specify things such as the direction of traffic, network profile, protocol, ports, and other conditions.

### Allowed apps and features

Within this box, is a list of the allowed applications and two checkboxes labelled Private and Public to the right of them.

These two checkboxes can be modified based on how we want certain applications to communicate with a network. For example, we might want to allow a file-sharing application on our Private home network but not on Public networks because where limiting exposure of the service.

On the other hand, we might want a web browser application to be allowed on both profiles because it needs network access regardless of whether we're at home or in public.

### Details

There is a *Details* button which provides additional information about the selected application or firewall rule, if that information is available.

## Advanced Settings

We can enter Windows Defender Firewall with Advanced Security by selecting the *Advanced Settings* option in *Firewall & network protection*.

Alternatively, there is a command which directly opens this window:

1. Press **Win + R**
2. Enter:

```cmd
wf.msc
```

This interface, provides more detailed control over the Windows Firewall than the standard Windows Security interface.

It also allows us to configure and manage:

- Inbound rules
- Outbound rules
- Connection security rules
- Firewall monitoring

| Feature | Description |
|--------|---------|
|Inbound rules|Controls network connections **coming into** the computer. These rules determine which incoming traffic is allowed or blocked.|
|Outbound rules|Control network connections **leaving** the computer. They determine which applications or services are allowed to send traffic out.|
|Connection security rules|Define how network connection should be **authenticated or protected**, such as by using IPsec to encrypt or authenticate traffic.|
| Firewall monitoring | Provides information about the firewall's current configuration, rules, and activity, helping administrators monitor how the firewall is operating.|

## App & browser control

App and browser control is a section of Windows Security containing several security features designed to protect the computer from malicious or untrusted applications, files, websites, downloads, and exploitation attempts.

Within the current version of Windows 11, App & browser control is divided into three main areas:

- Smart App Control
- Reputation-based protection
- Exploit protection

### Smart App Control

Smart App Control is designed to prevent untrusted, malicious, and potentially unwanted applications from running. 

When an application is launched, Smart App Control uses Microsoft's cloud-based app intelligence to assess whether the application is safe. If it cannot confidently determine this, then it can also use the application's digital signature as part of the decision. Unsigned or invalidly signed application can therefore be blocked. 

Smart App Control has three possible states:

1. On: actively blocks application considered untrusted or unsafe.
2. Evaluation: Windows monitors our applications and determines whether Smart App Control is suitable for our system.
3. Off: this feature is not actively protecting against untrusted applications.

According to Microsoft, Smart App Control is intended to work alongside Microsoft Defender and other security software rather than replace them.

### Reputation-based protection

This section contains the settings for **Microsoft Defender SmartScreen**.

SmartScreen uses reputation-based protection as about websites, files, application, and publishers to help identify potentially dangerous or unwanted content.

It includes several individual protection features:

- Check apps and files
- SmartScreen for Microsoft Edge
- Phishing protection
- Potentially unwanted app blocking
- SmartScreen for Microsoft Store apps

### Check apps and files

This uses Microsoft Defender SmartScreen to evaluate applications and files obtained from the web.

### Phishing protection

Windows 11 also has protection designed to detect situations where users enter sensitive information, such as their Windows password, into suspicious websites or applications. 

### Potentially unwanted app blocking 

This deals with PUAs/PUAs (potentially unwanted applications). These aren't necessarily malware, but may exhibit unwanted behavior such as excessive advertising, unwanted additional software, or other undesirable activity. 

### SmartScreen for Microsoft Store apps

This is using SmartScreen to protect our device by checking content associated with Microsoft Store applications. 

### SmartScreen vs Smart App Control

The two App and browser control features are different in that Smart App Control is primarily concerned with whether **applications (programs installed onto the computer's hard drive) are allowed to execute**. Whereas, SmartScreen's reputation-based protections cover things such as websites, downloads, and applications/files **obtained from the internet**.

## Exploit protection

Exploit protection is separate from the previous two security features.

It provides security mitigations designed to make it more difficult for attackers to exploit vulnerabilities within Windows or individual applications.

This feature can apply these mitigations to the operating system as a whole or to individual applications. Windows enables a set of protections by default that are intended to provide suitable protection for most users, although advanced users and administrators can customize them.

## Device Security

The Device security section of Windows Security is concerned primarily with protecting the computer itself at the **hardware, firmware, boot, and Windows kernel levels**.

The current Device security page can contain several areas:

- Core isolation
- Security processor
- Secure boot
- Data encryption
- Hardware security capability
- Secured-core PC information, where applicable

Within this document, I am only going to discuss the three areas on my standard Windows machine.

## Core isolation

This is designed to protect important Windows processes from malicious software by isolating them in a protected memory environment.

It uses **virtualization-based security (VBS)** to create an isolated area of memory that is separated from the normal Windows environment. Thus, making it more difficult for malware that has gained control of normal Windows processes to interfere with critical security mechanisms.

### Memory integrity

One of the most important features within Core isolation is Memory integrity, also called **Hypervisor-protected Code Integrity (HVCI)**. This feature helps protect Windows against malicious or untrusted kernel-mode code and drivers. 

As the Windows kernel operates at a highly privileged level, a malicious driver running at this level could potentially gain extensive control over the system. Therefore, Memory integrity uses virtualization to isolate the code-integrity mechanism and verify that kernel code and drivers meet Windows' security requirements before they are allowed to run.

### Local Security Authority protection

This is a Windows security feature that helps protect the credentials and authentication processes used by Windows.

The Local Security Authority Subsystem Service (lsass.exe) is an important Windows process responsible for functions such as verifying user credentials and managing authentication information.

LSA protection prevents untrusted software from loading into the LSA process or accessing protected LSA memory. This increases the difficulty for malware or an attacker with access to the system to steal credentials from LSASS. 

This matters because compromising lsass.exe has historically been a valuable objective for attackers attempting to steal credentials.

### Microsoft Vulnerable Driver Blocklist

This section helps prevent known dangerous kernel-mode drivers from loading on Windows.

Drivers operate at a highly privileged level because they allow Windows and hardware to communicate. A vulnerable or malicious driver can therefore potentially be abused to gain powerful control over the operating system.

Microsoft maintains a list of drivers that are known to contain security vulnerabilities, have been associated with malware signing certificates, or can be used to bypass Windows security mechanisms.

When the blocklist is enforced, Windows prevents drivers on the list from loading.

## Security Processor

The Security processor section in Windows security provides information about the computer's Trusted Platform Module (TPM). A TPM is a hardware-based security component used for cryptographic operations and for protecting secrets such as cryptographic keys.

Windows uses TPM capabilities for security features such as Windows Hello and BitLocker. Windows 11 requires TPM 2.0 on supported installations.

If security process does not appear under Device security, this doesn't automatically mean that the computer has no TPM. It may mean that the TPM is disabled in UEFI/BIOS or that it may not be available to Windows. The TPMS's status and specification version can be checked using:

```cmd
tpm.msc
```



