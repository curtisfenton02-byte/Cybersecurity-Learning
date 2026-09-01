def multiply(a: int, b: int) -> int:
    return a * b

result = multiply("Hello", 3)

# when I run mypy (type-checker tool) for this file, it will
# complain that the function expects an integer but is instead
# receiving a string
print(result)

def get_port() -> int:
    return "443"
# again mypy will complain because this function expects to
# return an integer not a string

