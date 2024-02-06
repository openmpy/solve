import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

s1 = set()

for i in range(n):
    s1.add(sys.stdin.readline().strip())

people = []

for i in range(m):
    name = sys.stdin.readline().strip()

    if name in s1:
        people.append(name)

print(len(people))
for i in sorted(people):
    print(i)