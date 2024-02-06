import sys
from collections import deque

# sys.stdin = open("input.txt", "r")

n, k = map(int, sys.stdin.readline().split())

dq = deque(range(1, n + 1))
arr = []

while len(dq) > 0:
    for _ in range(k - 1):
        dq.append(dq.popleft())

    arr.append(dq.popleft())

print('<' + ', '.join(map(str, arr)) + '>')