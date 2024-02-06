import sys
from collections import deque

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())
dq = deque(enumerate(map(int, sys.stdin.readline().split())))
arr = []

while dq:
    index, num = dq.popleft()
    arr.append(index + 1)

    if num > 0:
        dq.rotate(-(num - 1))
    else:
        dq.rotate(-num)

print(' '.join(map(str, arr)))