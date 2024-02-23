def solution(s, n):
    answer = ''
    
    for c in s:
        if 'a' <= c <= 'z':
            answer += chr((ord(c) - ord('a') + n) % 26 + ord('a'))
        elif 'A' <= c <= 'Z':
            answer += chr((ord(c) - ord('A') + n) % 26 + ord('A'))
        else:
            answer += c
            
    return answer