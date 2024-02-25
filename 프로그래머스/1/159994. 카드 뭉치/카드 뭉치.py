def solution(cards1, cards2, goal):
    i = j = 0
    
    for s in goal:
        if i < len(cards1) and cards1[i] == s:
            i += 1
        elif j < len(cards2) and cards2[j] == s:
            j += 1
        else:
            return 'No'
            
    return 'Yes'