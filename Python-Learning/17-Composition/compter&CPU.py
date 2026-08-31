class CPU:

    def process(self):
        print("CPU processing")

class Computer:

    def __init__(self):
        self.cpu = CPU()