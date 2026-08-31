def log_event(message, **details):
# here I am using ** to accept all keyword arguments
    print(message)
    print(details)

log_event(
    "Login successful",
# even though username and ip were not defined in the 
# function, ** allows this to work
    username="Curtis",
    ip="192.168.1.10"
)

# this can be repeated for a completely different set of
# details
log_event(
    "Port scan completed",
    target="192.168.1.10",
    ports=[22, 80, 443]
)