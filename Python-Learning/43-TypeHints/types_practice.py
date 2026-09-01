class Scanner:

    def scan(self):
        print("Scanning...")

    def stop(self):
        print("Stopping...")

scanner: Scanner = Scanner()

# because I have told VS Code that scanner: Scanner, it will 
# offer autocomplete options after the dot for this specific case
scanner.scan