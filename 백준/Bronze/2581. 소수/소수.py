import sys

# sys.stdin = open("input.txt", "r")

checked = [False] * 10001
checked[0] = checked[1] = True

for i in range(2, 10001):
    if checked[i] == True:
        continue

    for j in range(i * i, 10001, i):
        checked[j] = True

n = int(sys.stdin.readline().strip())
m = int(sys.stdin.readline().strip())

sum = 0
min_num = 10000

for i in range(n, m + 1):
    if checked[i] == False:
        sum += i
        min_num = min(min_num, i)

if sum == 0:
    print(-1)
else:
    print(sum)
    print(min_num)