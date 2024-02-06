import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

m_list = []
s = set()

for i in range(n):
    s.add(sys.stdin.readline().strip())

for i in range(m):
    m_list.append(sys.stdin.readline().strip())

count = 0
for i in m_list:
    if i in s:
        count += 1

print(count)
