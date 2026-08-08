class Employee:

    company = "CyberSecure Ltd"

    def __init__(self, name, role):
        self.name = name
        self.role = role

    def introduce(self):
        print(self.name, "works as a", self.role)

    @classmethod
    def getCompany(cls):
        return cls.company