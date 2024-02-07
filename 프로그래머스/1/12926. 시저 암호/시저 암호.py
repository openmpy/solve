def solution(s, n):
    answer = ''
    
    for ch in s:
        if ch == ' ':
            answer += ch
            continue
        
        if ch.islower() and ord(ch) + n > ord('z'):
            answer += chr(ord('a') + (ord(ch) + n) - ord('z') - 1)
        elif ch.isupper() and ord(ch) + n > ord('Z'): 
            answer += chr(ord('A') + (ord(ch) + n) - ord('Z') - 1)
        else:
            answer += chr(ord(ch) + n)
        
    return answer