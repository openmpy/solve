def solution(lottos, win_nums):
    answer = [0, 0]
    
    e = 0
    q = lottos.count(0)
    
    rank = {
        6: 1,
        5: 2,
        4: 3,
        3: 4,
        2: 5,
        1: 6,
        0: 6
    }
    
    for num in win_nums:
        for lotto in lottos:
            if lotto == 0:
                continue
                
            if lotto == num:
                e += 1
    
    answer[0], answer[1] = rank[e + q], rank[e]
    
    return answer