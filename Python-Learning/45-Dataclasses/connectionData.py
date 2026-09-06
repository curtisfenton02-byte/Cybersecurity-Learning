from dataclasses import dataclass

@dataclass
class Connection:
    ip: str
    port: int
    protocol: str = "TCP"

connection1 = Connection("192.168.1.10", 22)
connection2 = Connection("10.0.0.5", 443, "HTTPS")

print(connection1.protocol)
print(connection2.protocol)
print(connection1)