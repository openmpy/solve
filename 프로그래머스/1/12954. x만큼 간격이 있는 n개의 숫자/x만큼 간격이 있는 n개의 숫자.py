def solution(x, n):
    answer = []
    s = x
    
    while len(answer) < n:
        answer.append(s)
        s += x
    return answer