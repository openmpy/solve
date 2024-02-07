import sys, math

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

answer = math.factorial(n) / (math.factorial(m) * math.factorial(n - m))
print(int(answer))