import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

print(n * (n - 1))