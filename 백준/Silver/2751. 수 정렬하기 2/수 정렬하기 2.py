import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

arr = []

for _ in range(n):
    arr.append(int(sys.stdin.readline().strip()))

arr = sorted(arr)

for num in arr:
    print(num)