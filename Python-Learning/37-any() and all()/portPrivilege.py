ports = [22, 80, 443]

any(port < 1024 for port in ports)

all(port < 1024 for port in ports)