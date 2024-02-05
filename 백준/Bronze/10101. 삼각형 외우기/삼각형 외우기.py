import sys

# sys.stdin = open("input.txt", "r")

nums = [0] * 3

nums[0] = int(sys.stdin.readline().strip())
nums[1] = int(sys.stdin.readline().strip())
nums[2] = int(sys.stdin.readline().strip())

nums = sorted(nums)

if sum(nums) == 180:
    if nums[0] == nums[2]:
        print('Equilateral')
    elif (nums[0] == nums[1] and nums[1] != nums[2]) or (nums[0] != nums[1] and nums[1] == nums[2]):
        print('Isosceles')
    else:
        print('Scalene')
else:
    print('Error')