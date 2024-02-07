import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

arr = []

for _ in range(n):
    n, m = map(int, sys.stdin.readline().split())

    arr.append([n, m])

arr = sorted(arr, key = lambda x : (x[1], x[0]))

ans = end = 0

for s, e in arr:
    if s >= end:
        ans += 1
        end = e

print(ans)
