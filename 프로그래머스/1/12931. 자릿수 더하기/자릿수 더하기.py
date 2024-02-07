def solution(n):
    answer = 0
    s = str(n)
    
    for ch in s:
        answer += ord(ch) - ord('0')
    return answer