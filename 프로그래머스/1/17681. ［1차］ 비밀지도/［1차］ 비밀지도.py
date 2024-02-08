def solution(n, arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        number = str(format((arr1[i] | arr2[i]), 'b'))
        
        if len(number) < n:
            number = '0' * (n - len(number)) + number
        
        number = number.replace('1', '#')
        number = number.replace('0', ' ')
        
        answer.append(number)
        
    return answer