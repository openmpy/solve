def get_day(day):
    l = day.split('.')
    return 12 * 28 * int(l[0]) + 28 * int(l[1]) + int(l[2])

def solution(today, terms, privacies):
    answer = []
    
    ctx = {}
    
    for s in terms:
        l = s.split(' ')
        ctx[l[0]] = int(l[1])
        
    t = get_day(today)
        
    for i, s in enumerate(privacies):
        tt = get_day(s[:10])
        
        if tt + 28 * ctx[s[-1]] <= t:
            answer.append(i + 1)
            
    return answer