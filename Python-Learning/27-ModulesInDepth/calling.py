import test

# this would print Calculator loaded when run even though
# there is no code in this module. This is because in
# test.py, the first line is print("Calculator loaded")
# and when a module is imported, the top-level code is
# executed. 
 