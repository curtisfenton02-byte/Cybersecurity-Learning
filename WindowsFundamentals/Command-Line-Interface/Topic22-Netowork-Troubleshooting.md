# Network Troubleshooting

The CLI provides a variety of network-related commands which can display a system's current configuration, check ongoing connections, and troubleshoot networking issues.

## Network Configuration

### Ipconfig

```cmd
ipconfig
```

Checks and then displays the current network information. This information includes the system's:

- IP Address
- Subnet Mask
- Default Gateway

We can also add another command, called `/all` to view a larger list of information related to the network configuration. This includes **DNS Servers** and whether the **DHCP** is enabled.

```cmd
ipconfig /all
```

## Network Troubleshooting

A common troubleshooting task is testing whether a computer can exchange **ICMP** packets with another device. 

### What is ICMP?

ICMP stands for Internet Control Message Protocol and is used primarily to send **control, error, and diagnostic messages between network devices**.

ICMP has various message types and codes:

- Echo Request: Asks whether the device is present.
- Echo Reply: Reply from the contacted device, stating that they are indeed present.
- Destination Unreachable: States that the device cannot deliver the package to the intended destination.
- Time Exceeded: Alerts that the packet's lifetime had expired.

### Ping

```cmd
ping target_name
```

To test this we can use the `ping` command to send an ICMP Echo Request to the target and await an **Echo Reply**.

A reply confirms that ICMP communication between the two devices is working, although the absence of a reply doesn't necessarily mean the target is unreachable.

### Tracert

```cmd
tracert target_name
```

This is another valuable troubleshooting tool which stands for **trace route**. The command traces the network path taken to reach the target. It does this by sending packets with gradually increasing Time-To-Live (TTL) values.

When a packet's TTL reaches zero, the device that discards the packet normally sends an ICMP Time Exceeded message back to the sender.

By examining these responses, `tracert` can identify the network devices encountered along the route. 