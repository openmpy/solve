import sys

# sys.stdin = open("input.txt", "r")

t = int(sys.stdin.readline().strip())
nums = list(map(int, sys.stdin.readline().split()))

nums = sorted(nums)
print(nums[0] * nums[-1])