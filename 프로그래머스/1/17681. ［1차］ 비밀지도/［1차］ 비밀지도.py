def solution(n, arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        number = str(format((arr1[i] | arr2[i]), 'b'))
        number = number.rjust(n, '0')
        
        number = number.replace('1', '#')
        number = number.replace('0', ' ')
        
        answer.append(number)
        
    return answer