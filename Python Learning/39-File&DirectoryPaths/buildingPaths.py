from pathlib import Path

# creates Path object
folder = Path("logs")

# / joins the security.log and logs path together
file = folder / "security.log"

print(file)

