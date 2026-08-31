class Router:

    def __init__(self, name, ip):
        self.name = name
        self.ip = ip

    def show_ip(self):
        return self.ip

class Server:

    def __init__(self, name, ip):
        self.name = name
        self.ip = ip

    def show_ip(self):
        return self.ip