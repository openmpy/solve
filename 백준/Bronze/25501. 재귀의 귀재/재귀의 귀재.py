import sys, math

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

def recursion(s, l, r):
    global cnt
    cnt += 1

    if l >= r:
        return 1;
    elif s[l] != s[r]:
        return 0;
    else:
        return recursion(s, l+1, r-1)

def isPalindrome(s):
    return recursion(s, 0, len(s) - 1)

for _ in range(n):
    s = sys.stdin.readline().strip()

    cnt = 0
    print(isPalindrome(s), cnt)