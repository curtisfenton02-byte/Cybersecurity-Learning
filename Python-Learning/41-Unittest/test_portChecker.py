import unittest

from portChecker import is_valid_port, check_port

class TestPort(unittest.TestCase):
    def test_valid_port(self):
        self.assertTrue(is_valid_port(443))
    def test_lower_boundary(self):
        self.assertTrue(is_valid_port(1))
    def test_invalid_port(self):
        self.assertFalse(is_valid_port(70000))
    def test_raise_ValueError(self):
        with self.assertRaises(ValueError) as error:
            check_port(70000)

        print(error.exception)