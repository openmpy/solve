def solution(arr):
    answer = arr
    answer.remove(min(answer))
    return answer if answer else [-1]