def solution(s):
    answer = ''.join(sorted(list(map(str, s)), reverse = True))
    return answer