def solution(wallpaper):
    answer = [50, 50, 0, 0]
    
    for i, s in enumerate(wallpaper):
        if '#' in s:
            answer[0] = min(answer[0], i)
            answer[1] = min(answer[1], s.index('#'))
            answer[2] = max(answer[2], i + 1)
            answer[3] = max(answer[3], s.rindex('#') + 1)
            
    return answer