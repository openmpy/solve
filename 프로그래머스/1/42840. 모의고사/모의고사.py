def solution(answers):
    answer = []

    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    p = [0, 0, 0]

    for i, n in enumerate(answers):
        if p1[i % 5] == n:
            p[0] += 1
        if p2[i % 8] == n:
            p[1] += 1
        if p3[i % 10] == n:
            p[2] += 1

    m = max(p)

    for i, n in enumerate(p):
        if n == m:
            answer.append(i + 1)

    return answer