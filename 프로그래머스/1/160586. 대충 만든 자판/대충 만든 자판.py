def solution(keymap, targets):
    answer = []
    
    ctx = {}
    
    for s in keymap:
        for i, c in enumerate(s):
            if c in ctx:
                ctx[c] = min(ctx[c], i + 1)
            else:
                ctx[c] = i + 1
    
    for i, t in enumerate(targets):
        cnt = 0
        for c in t:
            if c not in ctx:
                cnt = -1
                break
                
            cnt += ctx[c]
            
        answer.append(cnt)
    
    return answer