def is_valid_port(port):
    return 1 <= port <= 65535

def check_port(port):
    if port < 1 or port > 65535:
        raise ValueError("Invalid port")
    return True