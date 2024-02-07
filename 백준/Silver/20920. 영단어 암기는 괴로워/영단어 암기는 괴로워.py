import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

dic = {}

for _ in range(n):
    text = sys.stdin.readline().strip()
    
    if len(text) >= m:
        if text in dic:
            dic[text] += 1
        else:
            dic[text] = 1

dic = sorted(dic.items(), key = lambda x : (-x[1], -len(x[0]), x[0]))
for i in dic:
    print(i[0])