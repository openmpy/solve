from collections import deque
import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
nums = list(map(int, sys.stdin.readline().split()))

dq = deque(i for i in range(1, n + 1))
cnt = 0

for num in nums:
    while True:
        if dq[0] == num:
            dq.popleft()
            break
        
        if dq.index(num) < len(dq) / 2:
            while dq[0] != num:
                dq.append(dq.popleft())
                cnt += 1
        else:
            while dq[0] != num:
                dq.appendleft(dq.pop())
                cnt += 1

print(cnt)