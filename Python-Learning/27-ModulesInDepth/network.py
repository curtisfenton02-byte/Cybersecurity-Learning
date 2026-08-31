# network.py

def check_port(port):
    return port < 1024

def scan_ports(ports):
    return [port for port in ports if port < 1024]


if __name__ == "__main__":
    ports = [22, 80, 443, 3389]
    print(scan_ports(ports))