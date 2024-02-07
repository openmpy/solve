def solution(arr1, arr2):
    answer = []
    
    for x, y in zip(arr1, arr2):
        tmp = []
        for i in range(len(x)):
            tmp.append(x[i] + y[i])
        answer.append(tmp)
        
    return answer