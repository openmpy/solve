import sys

# sys.stdin = open("input.txt", "r")

while(True):
    arr = list(map(int, sys.stdin.readline().split()))
    arr = sorted(arr)

    if arr[0] == arr[2] == 0:
        break

    if arr[0] + arr[1] <= arr[2]:
        print('Invalid')
    else:
        if arr[0] == arr[2]:
            print('Equilateral')
        elif (arr[0] == arr[1] and arr[1] != arr[2]) or (arr[0] != arr[1] and arr[1] == arr[2]):
            print('Isosceles')
        else:
            print('Scalene')