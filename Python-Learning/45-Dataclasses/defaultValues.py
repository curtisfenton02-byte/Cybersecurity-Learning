from dataclasses import dataclass

@dataclass
class Port:
    number: int
    protocol: str = "TCP" # default value for protocol

port1= Port(22)
port2= Port(443, "UDP")

print(port1)
# object 1 defaults to printing 22, TCP because we didn't provide
# the protocol ourselves 

print(port2)