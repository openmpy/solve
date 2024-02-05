import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

nums = list(map(int, sys.stdin.readline().split()))

arr = []

for i in range(len(nums) - 2):
    for j in range(i + 1, len(nums) - 1):
        for k in range(j + 1, len(nums)):
            if (nums[i] + nums[j] + nums[k] <= m):
                arr.append(nums[i] + nums[j] + nums[k])

print(max(arr))