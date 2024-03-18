def solution(players, callings):
    rank = {}
    
    for value, key in enumerate(players):
        rank[key] = value
        
    for c in callings:
        v = rank[c]
        
        rank[c] -= 1
        rank[players[v - 1]] += 1
        
        players[v - 1], players[v] = players[v], players[v - 1]
    
    return players