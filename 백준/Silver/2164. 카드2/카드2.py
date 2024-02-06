import sys
from collections import deque

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())
dq = deque(range(1, n + 1))

while len(dq) > 1:
    dq.popleft()

    tmp = dq.popleft()
    dq.append(tmp)

print(dq[0])