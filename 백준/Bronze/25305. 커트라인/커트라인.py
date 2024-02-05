import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

nums = list(map(int, sys.stdin.readline().split()))
nums = sorted(nums, reverse=True)

print(nums[m - 1])