def solution(n, m, section):
    answer = 0
    index = 0
    
    for n in section:
        if index <= n:
            index = n + m
            answer += 1
            
    return answer