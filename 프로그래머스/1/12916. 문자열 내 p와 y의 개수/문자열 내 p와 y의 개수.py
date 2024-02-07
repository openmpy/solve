def solution(s):
    s = s.lower()
    p = y = 0
    
    for ch in s:
        if ch == 'p':
            p += 1
        elif ch == 'y':
            y += 1
            
    return True if p == y else False