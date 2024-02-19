def solution(n):
    answer = 0
    start = 1

    while start <= n:
        s = 0
        for i in range(start, n + 1):
            s += i
            if s == n:
                answer += 1
                break
            elif s > n:
                break
        
        start += 1
    return answer