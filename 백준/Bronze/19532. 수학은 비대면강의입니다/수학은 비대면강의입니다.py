import sys

# sys.stdin = open("input.txt", "r")

a, b, c, d, e, f = map(int, sys.stdin.readline().split())

for x in range(-999, 999 + 1):
    for y in range(-999, 999 + 1):
        if a * x + b * y == c and d * x + e * y == f:
            print(x, y)
            break