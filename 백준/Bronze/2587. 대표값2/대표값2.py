import sys

# sys.stdin = open("input.txt", "r")

arr = []

for _ in range(5):
    arr.append(int(sys.stdin.readline().strip()))

arr = sorted(arr)
print(int(sum(arr) / len(arr)))
print(arr[int(len(arr) / 2)])