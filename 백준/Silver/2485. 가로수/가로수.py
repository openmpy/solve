import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

arr = []

for i in range(n):
    num = int(sys.stdin.readline().strip())
    arr.append(num)

arr2 = []

for i in range(1, n):
    arr2.append(arr[i] - arr[i - 1])

gcd = arr2[0]

for i in range(1, len(arr2)):
    gcd = math.gcd(gcd, arr2[i])

print(int((arr[-1] - arr[0]) / gcd) - n + 1)