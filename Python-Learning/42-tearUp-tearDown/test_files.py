import unittest

from pathlib import Path

class TestFiles(unittest.TestCase):

    def setUp(self):
        self.test_file = Path("temporary.txt")
        self.test_file.write_text("test data")

    def tearDown(self):
        self.test_file.unlink()

    def test_file_exists(self):
        self.assertTrue(self.test_file.exists())

    def test_file_exists(self):
        self.assertTrue(False)