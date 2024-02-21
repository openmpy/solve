import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

start = 1
stack = []
text = []
isFlag = False

for i in range(n):
    num = int(sys.stdin.readline().strip())
    
    while True:
        if stack and stack[-1] == num:
            stack.pop()
            text.append('-')
            break
        elif stack and stack[-1] > num:
            isFlag = True
            break
        else:
            stack.append(start)
            start += 1
            text.append('+')
    
    if isFlag == True:
        break

if isFlag:
    print('NO')
else:
    for c in text:
        print(c)
