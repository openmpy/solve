import sys

# sys.stdin = open("input.txt", "r")

while(True):
    arr = []
    n = int(sys.stdin.readline().strip())

    if n == -1:
        break

    for i in range(1, n):
        if n % i == 0:
            arr.append(i)

    if n == sum(arr):
        print(str(n) + " = " + ' + '.join(map(str, arr)))
    else:
        print(str(n) + " is NOT perfect.")