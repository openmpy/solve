import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

index = 2

while(n >= index):
    if n % index == 0:
        n /= index
        print(index)
    else:
        index += 1