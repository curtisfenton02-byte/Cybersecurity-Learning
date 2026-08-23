class InvalidPortError(Exception):
# this creates a custom exception called InvalidPortError
    pass
# means don't add anything into the class yet

def check_port(port):

    if port < 1 or port > 60000:
# raising the custom exception

         raise InvalidPortError("invalid project")

    return True

# catching the custom error
try:
    check_port(70000)

except InvalidPortError as error:
    print(error)

# this also works because InvalidPortError inherits from

# Exception. However, this is a more broad catch-all case
# try:
#    check_port(70000)

# except Exception as error:
#   print(error)



