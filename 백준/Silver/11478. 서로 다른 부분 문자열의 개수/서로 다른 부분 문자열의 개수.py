import sys

# sys.stdin = open("input.txt", "r")

s = sys.stdin.readline().strip()

ss = set()

for i in range(len(s)):
    for j in range(i, len(s)):
        ss.add(s[i : j + 1])

print(len(ss))