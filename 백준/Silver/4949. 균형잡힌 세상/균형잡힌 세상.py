import sys, math

# sys.stdin = open("input.txt", "r")

while(True):
    text = input()

    if text == '.':
        break

    stack = []
    is_flag = True

    for ch in text:
        if ch == '(' or ch == '[':
            stack.append(ch)
        elif ch == ')':
            if len(stack) == 0:
                is_flag = False
                break

            if stack[-1] == '(':
                stack.pop()
            else:
                is_flag = False
                break
        elif ch == ']':
            if len(stack) == 0:
                is_flag = False
                break

            if stack[-1] == '[':
                stack.pop()
            else:
                is_flag = False
                break

    if stack:
        is_flag = False
    
    print('yes' if is_flag else 'no')