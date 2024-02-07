import sys

# sys.stdin = open("input.txt", "r")

def sol(n):
    if n == 1:
        return ['*']
    
    stars = sol(n // 3)
    arr = []

    for i in stars:
        arr.append(i * 3)
    for i in stars:
        arr.append(i + ' ' * (n // 3) + i)
    for i in stars:
        arr.append(i * 3)
    
    return arr

n = int(sys.stdin.readline().strip())
print('\n'.join(sol(n)))