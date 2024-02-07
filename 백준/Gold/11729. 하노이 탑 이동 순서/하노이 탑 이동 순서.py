import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

def hanoi_tower(n, start, mid, to):
    if n == 1:
        print(str(start) + ' ' + str(to))
        return
    
    hanoi_tower(n - 1, start, to, mid)
    print(str(start) + ' ' + str(to))
    hanoi_tower(n - 1, mid, start, to)

print(2 ** n - 1)
hanoi_tower(n, 1, 2, 3)