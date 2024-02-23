def solution(s):
    l = int(len(s) / 2)
    answer = s[l] if len(s) % 2 == 1 else s[l - 1 : l + 1]
    return answer