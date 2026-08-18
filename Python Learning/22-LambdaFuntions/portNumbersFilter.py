ports = [20, 21, 22, 23, 80, 443, 3389]

open_ports = list(
    filter(lambda port: port < 1000, ports)
)

print(open_ports)
# [20, 21, 22, 23, 80, 443]