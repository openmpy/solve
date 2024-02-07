def solution(sizes):
    answer = x = y = 0
    
    for i in range(len(sizes)):
        tmp1 = max(sizes[i][0], sizes[i][1])
        tmp2 = min(sizes[i][0], sizes[i][1])
        
        x = max(x, tmp1)
        y = max(y, tmp2)
        
    return x * y