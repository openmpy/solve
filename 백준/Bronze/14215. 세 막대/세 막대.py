import sys

# sys.stdin = open("input.txt", "r")

arr = list(map(int, sys.stdin.readline().split()))

arr = sorted(arr)
if arr[0] + arr[1] <= arr[2]:
    arr[2] = (arr[0] + arr[1]) - 1

print(sum(arr))