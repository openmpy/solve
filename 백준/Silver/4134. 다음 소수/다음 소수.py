import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

def find(num):
    if num == 0 or num == 1:
        return False

    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
        
    return True

for i in range(n):
    m = int(sys.stdin.readline().strip())

    while(True):
        if find(m):
            print(m)
            break
        
        m += 1
