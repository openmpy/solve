import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())
card = list(map(int, sys.stdin.readline().split()))

dic = {card[i] : i for i in range(len(card))}

m = int(sys.stdin.readline().strip())
find = list(map(int, sys.stdin.readline().split()))

for i in find:
    if dic.get(i) == None:
        print(0, end = " ")
    else:
        print(1, end = " ")
