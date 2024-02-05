import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

max_x = max_y = -10000
min_x = min_y = 10000

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())

    max_x = max(max_x, x)
    min_x = min(min_x, x)

    max_y = max(max_y, y)
    min_y = min(min_y, y)

print(abs(max_x - min_x) * abs(max_y - min_y))