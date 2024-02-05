import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

i = 666
j = 0

while(True):

    if '666' in str(i):
        j += 1

        if j == n:
            print(i)
            break
    
    i += 1