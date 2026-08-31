class CPU:
    def process(self):
        ...


class NetworkCard:
    def connect(self):
        ...


class Storage:
    def save(self):
        ...

class Computer:

    def __init__(self):
        self.cpu = CPU()
        self.network_card = NetworkCard()
        self.storage = Storage()