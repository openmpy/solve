def solution(k, m, score):
    answer = 0
    score = sorted(score, reverse = True)

    for i in range(0, int(len(score) / m)):
        answer += score[(i + 1) * m - 1] * m

    return answer