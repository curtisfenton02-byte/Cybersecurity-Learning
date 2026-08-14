ips = ["192.168.1.1", "10.0.0.5", "192.168.1.20"]

# comprehension to filter addresses beginning with 192.168

local_ips = [ip for ip in ips if ip.startswith("192.168")]

print(local_ips)