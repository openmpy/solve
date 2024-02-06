import sys

# sys.stdin = open("input.txt", "r")

n = int(sys.stdin.readline().strip())

people = []

for _ in range(n):
    age, name = sys.stdin.readline().split()
    people.append([int(age), name])

people.sort(key = lambda x : x[0])

for person in people:
    print(person[0], person[1])