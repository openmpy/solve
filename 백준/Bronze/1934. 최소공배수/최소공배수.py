import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())

    gcd = math.gcd(a, b)
    print(int(a * b / gcd))