def solution(d, budget):
    d = sorted(d)
    c = 0
    
    for i in d:
        if budget - i >= 0:
            budget -= i
            c += 1
            
    return c