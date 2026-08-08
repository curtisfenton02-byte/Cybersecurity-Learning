class SecurityTool:

    def __init__(self, name):
        self.name = name

    def show_name(self):
        return self.name

    @classmethod
    def tool_type(cls):
        return "security tool"

    @staticmethod
    def is_valid_port(port):
        return 1 <= port <= 65535

# instance method
tool1 = SecurityTool("port scanner")

print(tool1.show_name())# prints port scanner

# class method
print(SecurityTool.tool_type())# prints security tool

# static method
print(SecurityTool.is_valid_port(443))# prints True