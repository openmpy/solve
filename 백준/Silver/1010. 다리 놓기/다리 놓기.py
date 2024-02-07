import sys, math

# sys.stdin = open("input.txt", "r")

t = int(sys.stdin.readline().strip())

for _ in range(t):
    r, n = map(int, sys.stdin.readline().split())

    answer = math.factorial(n) / (math.factorial(r) * math.factorial(n - r))
    print(int(answer))