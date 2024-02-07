def solution(s):
    answer = []
    text = ''
    
    for i, ch in enumerate(s):
        if text.rfind(ch) != -1:
            answer.append(i - text.rfind(ch))
        else:
            answer.append(text.rfind(ch))
        text += ch
        
    return answer