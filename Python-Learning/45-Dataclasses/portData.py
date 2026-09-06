from dataclasses import dataclass

@dataclass
class Port:
    number: int
    protocol: str

# dataclasses still allows for normal class methods to be implemented
    def is_common_port(self):
# checks whether our object's number matches the listed numbers
# in the list 
        return self.number in [22, 80, 443]

    def is_secure(self):
# compares the protocol attribute belonging to our port object and
# compare it with the string HTTPS
        return self.protocol == "HTTPS"

port = Port(443, "HTTPS")

print(port.is_common_port()) # True
print(port.is_secure()) # True