import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

count = 0

while(n > 0):
    if n % 5 != 0:
        n -= 3
        count += 1
    else:
        count += n / 5
        n = 0
        break

print(int(count) if n == 0 else -1)