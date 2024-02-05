import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

num = 0

for i in range(1, n + 1):
    sum = i
    for ch in (str(i)):
        sum += int(ch)

    if sum == n:
        num = i
        break

print(num)