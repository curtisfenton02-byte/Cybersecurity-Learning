ports = [21, 22, 23, 53, 80, 443, 3389]

secure = list(
    filter(lambda port: port in [22, 443], ports)
# port in = look for these ports within the list
)

print(secure)
# [22, 443]