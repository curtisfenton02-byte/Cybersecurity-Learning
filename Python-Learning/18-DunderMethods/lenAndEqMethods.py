class NetworkDevice:

    def __init__(self, name, ip):
        self.name = name
        self.ip = ip

    def __len__ (self):
# this dunder method calculates the character length of an object
        return len(self.name)

    def __eq__(self, other):
# this checks whether two objects are the same
        return self.name == other.name and self.ip == other.ip
# self is device1 and other is device 2

device1 = NetworkDevice("Router01", "192.168.1.1")
device2 = NetworkDevice("Router01", "192.168.1.1")

print(len(device1))
# python does device1.__len__()
# output = 8

print(device1 == device2)
# python does device1.__eq__(device2)
# output = True