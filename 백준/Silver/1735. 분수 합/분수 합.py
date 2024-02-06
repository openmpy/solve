import sys, math

# sys.stdin = open("input.txt", "r")

a, b = map(int, sys.stdin.readline().split())
x, y = map(int, sys.stdin.readline().split())

n = y * a + b * x
m = b * y

gcd = math.gcd(n, m)

print(int(n / gcd), int(m / gcd))