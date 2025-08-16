import sys
import os

class SimpleCodeFormatter:
    def __init__(self, file_path):
        self.file_path = file_path

    def format(self):
        with open(self.file_path, 'r') as file:
            code = file.read()
        formatted_code = self._apply_formatting(code)
        with open(self.file_path, 'w') as file:
            file.write(formatted_code)

    def _apply_formatting(self, code):
        # Implement simple formatting logic here
        return code.strip()  # Example: just trims whitespace

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print('Usage: python formatter.py <file_path>')
        sys.exit(1)
    file_path = sys.argv[1]
    formatter = SimpleCodeFormatter(file_path)
    formatter.format()