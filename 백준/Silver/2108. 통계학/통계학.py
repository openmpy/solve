import sys

# sys.stdin = open("input.txt", "r")

t = int(sys.stdin.readline().strip())

arr = []
dic = {}

for _ in range(t):
    num = int(sys.stdin.readline().strip())
    arr.append(num)

    if num in dic:
        dic[num] += 1
    else:
        dic[num] = 1

arr = sorted(arr)

# 산술평균
print(round(sum(arr) / len(arr)))
    
# 중앙값
print(arr[int(len(arr) / 2)])

# 최빈값
m = 0
for i in dic.values():
    m = max(m, i)

dic2 = {}
for i in dic:
    if dic[i] == m:
        dic2[i] = 1

dic2 = sorted(dic2)

if len(dic2) > 1:
    print(dic2[1])
else:
    print(dic2[0])

# 범위
print(arr[-1] - arr[0])