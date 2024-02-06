import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

dic = {}
dic2 = {}

for i in range(n):
    name = sys.stdin.readline().strip()
    dic[name] = i + 1
    dic2[i + 1] = name

for i in range(m):
    text = sys.stdin.readline().strip()

    if text.isnumeric():
        print(dic2[int(text)])
    else:
        print(dic[text])

