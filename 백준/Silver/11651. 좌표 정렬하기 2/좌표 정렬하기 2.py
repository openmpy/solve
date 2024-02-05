import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

arr = []

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())

    arr.append([a, b])

arr.sort(key = lambda x : (x[1], x[0]))

for num in arr:
    print(num[0], num[1])