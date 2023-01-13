n, m = map(int, input().split())

x_list = [False] * m

count = 0

input_list = []

for i in range(n):
  input_list.append(input())

for i in range(n):
  for j in range(m):
    if 'X' == input_list[i][j]:
      x_list[j] = True

for i in range(n):
  if 'X' not in input_list[i]:
    count += 1
  
    for i in range(len(x_list)):
      if x_list[i] == False:
        x_list[i] = True
        break    

for i in x_list:
  if i == False:
    count += 1

print(count)