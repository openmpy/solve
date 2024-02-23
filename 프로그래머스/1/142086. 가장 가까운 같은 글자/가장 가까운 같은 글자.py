def solution(s):
    answer = []
    s2 = ''
    
    for i, c in enumerate(s):
        if s2.find(c) != -1:
            answer.append(i - s2.rfind(c))
        else:
            answer.append(-1)
        s2 += c
        
    return answer