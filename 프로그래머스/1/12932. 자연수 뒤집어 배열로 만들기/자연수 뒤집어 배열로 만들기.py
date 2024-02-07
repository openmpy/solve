def solution(n):
    answer = []
    s = str(n)
    
    arr = list(s)
    arr.reverse()
    
    answer = list(map(int, arr))
    return answer