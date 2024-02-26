import math

def is_prime_number(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return True
        
    return False

def solution(nums):
    answer = 0
    
    for i in range(0, len(nums) - 2):
        for j in range(i + 1, len(nums) - 1):
            for k in range(j + 1, len(nums)):
                s = nums[i] + nums[j] + nums[k]
                
                if (is_prime_number(s) == False):
                    answer += 1
                    
    return answer