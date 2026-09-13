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