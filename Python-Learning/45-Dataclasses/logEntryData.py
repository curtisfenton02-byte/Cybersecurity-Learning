from dataclasses import dataclass

@dataclass
class LogEntry:
# dataclasses utilize type hints to describe expected data types
    ip: str
    port: int 
    status: str

entry = LogEntry("192.168.1.10", 443, "blocked")

# printing data attributes
print(entry.ip)
print(entry.port)
print(entry.status)