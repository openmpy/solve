def count(num):
    c = 0
    
    for i in range(1, int(num ** (1 / 2)) + 1):
        if num % i == 0:
            c += 2
        if i * i == num:
            c -= 1
            
    return c

def solution(number, limit, power):
    answer = 0
    
    for i in range(1, number + 1):
        if count(i) > limit:
            answer += power
        else:
            answer += count(i)
        
    return answer