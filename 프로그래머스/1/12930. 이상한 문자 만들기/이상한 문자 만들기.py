def solution(s):
    answer = ''
    
    arr = s.split(' ')
    li = []
    
    for s in arr:
        tmp = ''
        for i, c in enumerate(s):
            if i % 2 == 0:
                tmp += c.upper()
            else:
                tmp += c.lower()
                
        li.append(tmp)
    
    answer = ' '.join(li)
    return answer