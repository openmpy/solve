def solution(n):
    answer = (n ** (1 / 2) + 1) ** 2 if n ** (1 / 2) % 1 == 0 else -1
    return answer