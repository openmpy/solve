import sys

# sys.stdin = open("input.txt", "r")

t = int(sys.stdin.readline().strip())

s = set()
s.add("ChongChong")

for _ in range(t):
    first, second = sys.stdin.readline().split()

    if first in s or second in s:
        s.add(first)
        s.add(second)

print(len(s))