import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())
arr = list(map(int, sys.stdin.readline().split()))

stack = []
index = 1
is_flag = True

for i in arr:
    stack.append(i)

    while stack and stack[-1] == index:
        stack.pop()
        index += 1
    
    if len(stack) > 1 and stack[-1] > stack[-2]:
        is_flag = False
        break

if stack:
    is_flag = False

print('Nice' if is_flag else 'Sad')