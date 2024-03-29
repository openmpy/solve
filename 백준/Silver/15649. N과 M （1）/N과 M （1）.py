import sys, math

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

arr = []

def dfs():
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(1, n + 1):
        if i not in arr:
            arr.append(i)
            dfs()
            arr.pop()

dfs()