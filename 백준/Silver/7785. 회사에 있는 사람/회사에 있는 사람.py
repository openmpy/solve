import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

s = set()

for i in range(n):
    name, state = sys.stdin.readline().split()

    if state == 'enter':
        s.add(name)
    elif state == 'leave':
        s.remove(name)

for i in sorted(s, reverse=True):
    print(i)
