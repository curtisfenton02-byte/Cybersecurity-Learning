class Device: # parent class

    def __init__(self, name, ip):
# these attributes belong to each individual Device object
        self.name = name
        self.ip = ip

    def show_ip(self):
# instance method
        return self.ip
# self represents whichever object called this method

class Router(Device): # child class

    def restart_router(self):
# individual functionality belonging specifically to router
        print("router restarting")

class Server(Device): # child class
    pass 
# pass (do nothing) is required as classes cannot be empty


# creating objects
router1 = Router("main router", "192.168.1.1")
#this works because router can use init() from the device class

server1 = Server("web server", "192.168.1.20")

#using inherited functionality 
print(router1.show_ip())
# router can also use the method show ip

print(server1.show_ip())

#using individual functionality
router1.restart_router()