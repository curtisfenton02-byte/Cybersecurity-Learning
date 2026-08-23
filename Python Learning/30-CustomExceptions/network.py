# here are two separate custom exceptions in one program
class InvalidPortError(Exception):
    pass


class InvalidIPAddressError(Exception):
    pass

# calling each exception individually
def check_port(port):

    if port < 1 or port > 65535:
        raise InvalidPortError("Invalid port")


def check_ip(ip):

    if "." not in ip:
        raise InvalidIPAddressError("Invalid IP address") 