import unittest

from calculatorClass import Calculator


class TestCalculator(unittest.TestCase):

    def setUp(self):
        print("Setting up")
        self.calculator = Calculator()

    def tearDown(self):
        print("Cleaning up")

    def test_add(self):
        print("test add")
        self.calculator.add(5)
        self.assertEqual(self.calculator.value, 5)

    def test_subtract(self):
        print("test subtract")
        self.calculator.subtract(3)
        self.assertEqual(self.calculator.value, -3)