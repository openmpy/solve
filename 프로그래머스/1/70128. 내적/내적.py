def solution(a, b):
    answer = 0
    
    for i, n in enumerate(a):
        answer += n * b[i]
    return answer