import unittest

from calculator import add, multiply


class TestAdd(unittest.TestCase):

    def test_add_positive_numbers(self):
        self.assertEqual(add(2, 3), 5)

    def test_add_negative_numbers(self):
        self.assertEqual(add(-2, -3), -5)

    def test_add_zero(self):
        self.assertEqual(add(5, 0), 5)

    def test_not_equal(self):
        self.assertNotEqual(multiply(5, 2), 10)