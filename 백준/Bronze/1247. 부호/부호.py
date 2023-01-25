from sys import stdin

result = []
for i in range(3):
  N = int(stdin.readline())
  sum = 0
  for j in range(N):
    sum += int(stdin.readline())
  
  result.append(sum)

for i in result:
  if i > 0:
    print('+')
  elif i < 0:
    print('-')
  else:
    print('0')