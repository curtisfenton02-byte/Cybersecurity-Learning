import unittest

from portCollection import ports

class TestPortCollection(unittest.TestCase):
    def test_port(self):
        self.assertIn(443, ports)