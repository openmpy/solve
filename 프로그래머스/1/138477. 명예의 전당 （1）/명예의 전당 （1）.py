def solution(k, score):
    answer = []
    rank = []
    
    for i in score:
        rank.append(i)
        rank = sorted(rank, reverse = True)
        
        if len(answer) < k:
            answer.append(rank[-1])
        else:
            answer.append(rank[k - 1])
            
    return answer