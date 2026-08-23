class InvalidPortError(Exception):
# this class contains an init() method
    def __init__(self, port):
# the constructors receive InvalidPortError and 70000
        self.port = port
    # port = 70000
        super().__init__(f"Invalid port: {port}")
        # this message is created

# this is the raise object which is passed into the class
raise InvalidPortError(70000)