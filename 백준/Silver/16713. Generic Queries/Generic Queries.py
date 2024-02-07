import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

acc = []
acc.append(0)

for i in range(1, len(arr) + 1):
    acc.append(acc[i - 1] ^ arr[i - 1])

ans = 0
for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    ans ^= acc[y] ^ acc[x - 1]

print(ans)
