import sys

# sys.stdin = open("input.txt", "r")

x = []
y = []

for _ in range(3):
    a, b = map(int, sys.stdin.readline().split())
    
    x.append(a)
    y.append(b)

for i in range(3):
    if x.count(x[i]) == 1:
        fx = x[i]
    
    if y.count(y[i]) == 1:
        fy = y[i]

print(fx, fy)