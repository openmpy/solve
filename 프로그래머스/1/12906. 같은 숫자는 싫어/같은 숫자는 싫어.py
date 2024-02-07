def solution(arr):
    answer = [arr[0]]
    
    for n in arr:
        if answer[-1] != n:
            answer.append(n)
            
    return answer