def say_hello(number):

    if number == 0:
        return

    print("Hello")
    say_hello(number - 1)

say_hello(3)