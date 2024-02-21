def solution(n):
    answer = 0
    
    for c in str(n):
        answer += ord(c) - ord('0')
        
    return answer