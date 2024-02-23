def solution(absolutes, signs):
    answer = 0
    
    for i, j in enumerate(signs):
        answer += absolutes[i] if j else -absolutes[i]
    return answer