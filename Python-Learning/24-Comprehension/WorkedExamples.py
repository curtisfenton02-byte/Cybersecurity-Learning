# Q1
numbers = [2, 4, 6, 8]

doubled = [number * 2 for number in numbers]

# Q2

names = ["alice", "bob", "curtis"]

uppercase = [name.upper() for name in names]

# Q3

numbers = [1, 2, 3, 4, 5, 6]

even_numbers = [number for number in numbers if number % 2 == 0]

# Q4

numbers = [1, 2, 3, 4, 5, 6]

result = [number * 10 for number in numbers if number > 3]

# Q5

ips = [
    "192.168.1.1",
    "10.0.0.5",
    "192.168.1.20",
    "172.16.0.1"]

local_ips = [ip for ip in ips if ip.startswith("192.168")]

# Q6

ports = [20, 21, 22, 80, 443, 3389]

large_ports = [port * 2 for port in ports if port > 100]

# Q7

numbers = [1, 2, 3, 4, 5]

result = [number * 3 for number in numbers 
          if number % 2 != 0]

# output: [3, 9, 15]

# Q8

numbers = [1, 2, 3, 4]

squares = {number: number * number for number in numbers}

# Challenge

numbers = [2, 5, 8, 11]

result = [number * number for number in numbers if number > 5]



