import sys

# sys.stdin = open("input.txt", "r")

s = sys.stdin.readline().strip()

arr = []

for c in s:
    arr.append(c)

arr = sorted(arr, reverse=True)
print(''.join(arr))