def solution(s):
    l = int(len(s) / 2)
    answer = s[l - 1 : l + 1] if len(s) % 2 == 0 else s[l]
    return answer