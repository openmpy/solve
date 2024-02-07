def solution(x):
    answer = True
    
    arr = list(str(x))
    
    sum = 0
    for ch in arr:
        sum += int(ch)
    
    return True if x % sum == 0 else False