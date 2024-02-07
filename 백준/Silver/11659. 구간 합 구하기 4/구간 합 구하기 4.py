import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

acc = []
acc.append(arr[0])

for i in range(1, len(arr)):
    acc.append(acc[i - 1] + arr[i])

for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    
    if x - 2 < 0:
        print(acc[y - 1])
    else:
        print(acc[y - 1] - acc[x - 2])
