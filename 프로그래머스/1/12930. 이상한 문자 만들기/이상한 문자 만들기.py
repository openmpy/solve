def solution(s):
    answer = s.split(' ')
    
    arr = []
    for text in answer:
        s2 = ''
        for i, ch in enumerate(text):
            if i % 2 == 1:
                s2 += ch.lower()
            else:
                s2 += ch.upper()
                
        arr.append(s2)
        
    return ' '.join(arr)