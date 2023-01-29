T = int(input())

a_list = []
b_list = []

for i in range(T):
  a, b = map(int, input().split())
  a_list.append(a % 10)
  b_list.append(b)

for i in range(T):  
  if a_list[i] == 1 or a_list[i] == 5 or a_list[i] == 6:
    print(a_list[i], end='')
  elif a_list[i] == 0:
    print(10, end='')    
  elif a_list[i] == 4 or a_list[i] == 9:
    if int(b_list[i] % 2) == 0:
      print((a_list[i] ** 2) % 10, end='' )
    else:            
      print(a_list[i], end='')
  else:
    temp = b_list[i] % 4
    if temp == 0:
      print((a_list[i] ** 4) % 10, end='')
    else:  
      print((a_list[i] ** temp) % 10, end='')
  if i != T - 1:
    print()






