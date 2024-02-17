def solution(A,B):
    A = sorted(A)
    B = sorted(B, reverse=True)

    answer = 0

    for i in range(0, len(A)):
        answer += A[i] * B[i]
    return answer