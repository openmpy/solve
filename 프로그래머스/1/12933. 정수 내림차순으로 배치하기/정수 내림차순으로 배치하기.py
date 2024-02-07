def solution(n):
    s = str(n)
    arr = list(map(str, s))
    
    arr = sorted(arr, reverse = True)
    
    s2 = ''
    for ch in arr:
        s2 += ch
        
    return int(s2)