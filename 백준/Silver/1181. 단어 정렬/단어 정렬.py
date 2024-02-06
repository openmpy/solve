import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

words = []

for i in range(n):
    words.append(sys.stdin.readline().strip())

text = list(set(words))
text.sort()
text.sort(key=len)

for s in text:
    print(s)