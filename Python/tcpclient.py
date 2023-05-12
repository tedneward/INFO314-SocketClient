import sys

# Command-line args are stored in the "argv" array in "sys"
# So the first command-line arg is sys.argv[0]
host = sys.argv[1]
port = int(sys.argv[2])
instrs = sys.argv[3:]

print("Opening connection to " + host + " on " + port + " passing " + instrs)

# Now it's up to you to connect and send and all that    