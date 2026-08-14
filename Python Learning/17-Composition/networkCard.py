class NetworkCard:

    def connect(self):
# here self represents the NetworkCard object not computer1
        print("Network card connected")

class Computer:

    def __init__(self, name):
        self.name = name
        self.network_card = NetworkCard()
# here python creates a new NetworkCard object and stores a 
# reference to it inside computer1
    def connect_to_network(self):
        print(self.name)
# prints computer1's name
        self.network_card.connect()
# this is seen as computer1.network_card, which contains the
# NetworkCard object. So this line becomes NetworkCard.connect()
computer1 = Computer("Security PC")

computer1.connect_to_network()

