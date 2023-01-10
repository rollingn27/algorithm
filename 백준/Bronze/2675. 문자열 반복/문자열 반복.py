T = int(input())

data = []

for _ in range(T):
  data.append(list(map(str, input().split())))


for i in range(len(data)):
  for j in range(len(data[i][1])):
    print(int(data[i][0]) * data[i][1][j], end='')
  print()