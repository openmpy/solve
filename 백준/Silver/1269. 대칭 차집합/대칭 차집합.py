import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

s1 = set(list(map(int, sys.stdin.readline().split())))
s2 = set(list(map(int, sys.stdin.readline().split())))

print(len(s1 - s2) + len(s2 - s1))