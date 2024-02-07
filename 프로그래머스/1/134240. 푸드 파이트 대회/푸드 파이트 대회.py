def solution(food):
    answer = ''
    
    for i, n in enumerate(food):
        if n % 2 == 1:
            food[i] = n - 1
            
    text = ''
    for i in range(1, len(food)):
        text += str(i) * int(food[i] / 2)
        
    answer = text + '0' + text[::-1]
    return answer