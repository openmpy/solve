def solution(s):
    stack = []

    for c in s:
        if c == '(':
            stack.append(')')
        else:
            if stack:
                stack.pop()
            else:
                return False

    return not stack