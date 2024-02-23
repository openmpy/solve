def solution(x):
    s = 0

    for c in str(x):
        s += int(c)

    return x % s == 0