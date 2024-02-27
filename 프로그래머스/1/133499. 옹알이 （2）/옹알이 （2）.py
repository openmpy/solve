def solution(babbling):
    answer = 0
    
    good = ["aya", "ye", "woo", "ma"]
    bad = ["ayaaya", "yeye", "woowoo", "mama"]
    
    for i in range(len(babbling)):
        for b in bad:
            babbling[i] = babbling[i].replace(b, '1')
        for g in good:
            babbling[i] = babbling[i].replace(g, '0')
        babbling[i] = babbling[i].replace('0', '')

    return babbling.count('')