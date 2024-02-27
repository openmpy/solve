def solution(X, Y):
    answer = ''
    
    arr_x = [0] * 10
    arr_y = [0] * 10
    
    num = []
    
    for c in X:
        arr_x[ord(c) - ord('0')] += 1
        
    for c in Y:
        arr_y[ord(c) - ord('0')] += 1
    
    for i in range(10):
        m = min(arr_x[i], arr_y[i])
        if m == 0:
            continue
            
        for j in range(m):
            num.append(i)
        
    answer = ''.join(sorted(list(map(str, num)), reverse = True))
    
    if len(answer) == 0:
        return '-1'
    elif len(answer) == answer.count('0'):
        return '0'
    
    return answer