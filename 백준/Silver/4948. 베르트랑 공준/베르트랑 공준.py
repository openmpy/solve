import sys, math

# sys.stdin = open("input.txt", "r")

m = 123456 * 2

checked = [False] * (m + 1)
checked[0] = checked[1] = True

for i in range(2, int(m ** 0.5) + 1):
    if checked[i]:
        continue

    for j in range(i * i, m + 1, i):
        checked[j] = True

while (True):
    n = int(sys.stdin.readline().strip())

    if n == 0:
        break

    count = 0
    for i in range(n + 1, n * 2 + 1):
        if checked[i] == False:
            count += 1
    
    print(count)

