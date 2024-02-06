import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

for i in range(n):
    text = sys.stdin.readline().strip()

    stack = []
    is_flag = False

    for c in text:
        if c == '(':
            stack.append('(')
        else:
            if len(stack) == 0:
                is_flag = True
                break

            stack.pop()
    
    if len(stack):
        is_flag = True

    print('NO' if is_flag == True else 'YES')