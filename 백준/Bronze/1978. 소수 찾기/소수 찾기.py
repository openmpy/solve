import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

checked = [False] * 1001
checked[0] = checked[1] = True

for i in range(2, 1001):
    if checked[i] == True:
        continue

    for j in range(i * i, 1001, i):
        checked[j] = True

arr = list(map(int, sys.stdin.readline().split()))
count = 0

for num in arr:
    if checked[num] == False:
        count += 1

print(count)