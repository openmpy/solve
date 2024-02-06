import sys, math

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

checked = [False] * 1000001
checked[0] = checked[1] = True

for i in range(2, int(1000001 ** 0.5) + 1):
    if checked[i]:
        continue

    for j in range(i * i, 1000001, i):
        checked[j] = True

for i in range(n, m + 1):
    if checked[i] == False:
        print(i)
