def solution(array, commands):
    answer = []
    
    for cmd in commands:
        i = cmd[0] - 1
        j = cmd[1]
        
        arr = sorted(array[i : j])
        answer.append(arr[cmd[2] - 1])
        
    return answer