ips = [
    " 192.168.1.1 ",
    " 10.0.0.5 ",
    " 172.16.0.1 "
]
# I want to strip the whitespace from each IP

#
clean_ips = list(map(str.strip, ips))

print(clean_ips)
# output: no blank spaces within any IP