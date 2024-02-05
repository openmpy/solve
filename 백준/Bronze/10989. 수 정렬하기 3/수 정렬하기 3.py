import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())
counting = [0] * (10000 + 1)


for _ in range(n):
    i = int(sys.stdin.readline().strip())
    counting[i] += 1

for i in range(1, 10000 + 1):
    if counting[i] == 0:
        continue

    for _ in range(counting[i]):
        print(i)