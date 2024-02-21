import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

for i in range(n):
    text = sys.stdin.readline().strip()

    stack = []
    isFlag = False

    for c in text:
        if c == '(':
            stack.append(')')
        elif not stack or stack.pop() != c:
            isFlag = True
            break

    if stack:
        isFlag = True

    print('NO' if isFlag else 'YES')