import unittest

from calculatorFunction import add_numbers


class TestAddNumbers(unittest.TestCase):

    def test_positive_numbers(self):
        numbers = [1, 2, 3]
        self.assertEqual(add_numbers(numbers), 6)

    def test_more_numbers(self):
        numbers = [10, 20, 30]
        self.assertEqual(add_numbers(numbers), 60)

    def test_single_number(self):
        numbers = [5]
        self.assertEqual(add_numbers(numbers), 5)

