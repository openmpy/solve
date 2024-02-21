def solution(n):
    answer = int(''.join(sorted(list(map(str, str(n))), reverse = True)))
    return answer