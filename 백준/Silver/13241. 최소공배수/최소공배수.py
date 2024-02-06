import sys, math

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

gcd = math.gcd(n, m)
print(int(n * m / gcd))