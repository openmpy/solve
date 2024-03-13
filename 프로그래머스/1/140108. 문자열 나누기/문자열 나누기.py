def solution(s):
    answer = 0
    
    ch = ''
    cnt1 = 0
    cnt2 = 0
    
    for i in s:
        if cnt1 == cnt2:
            answer += 1
            ch = i
            
        if ch == i:
            cnt1 += 1
        else:
            cnt2 += 1
            
    return answer