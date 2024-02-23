def solution(sizes):
    answer = 0
    
    mx = 0
    mn = 0
    
    ax = 0
    ax2 = 0
    
    for i in sizes:
        mx = max(i[0], i[1])
        ms = min(i[0], i[1])
        
        ax = max(mx, ax)
        ax2 = max(ms, ax2)
        
    answer = ax * ax2
    
    return answer