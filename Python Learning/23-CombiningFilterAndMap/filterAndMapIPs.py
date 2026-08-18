ips = [
    "192.168.1.1 ",
    "10.0.0.5",
    "192.168.1.20 ",
    "172.16.0.4"
]

# filtering addresses
local_ips = filter(
    lambda ip: ip.startswith("192.168"),
    ips
)

# removing blank spaces from local ips with map

result = list(map(str.strip, local_ips))

print(result)
