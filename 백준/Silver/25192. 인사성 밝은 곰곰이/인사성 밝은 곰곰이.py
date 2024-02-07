import sys

# sys.stdin = open("input.txt", "r")

t = int(sys.stdin.readline().strip())

dic = {}
ans = 0

for _ in range(t):
    text = sys.stdin.readline().strip()

    if text == 'ENTER':
        ans += len(dic)
        dic.clear()
    else:
        dic[text] = 1

print(ans + len(dic))