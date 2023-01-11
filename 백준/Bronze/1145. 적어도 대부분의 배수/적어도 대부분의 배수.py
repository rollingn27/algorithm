five_num = list(map(int, input().split()))

result = 4
while(1):
  
  count = 0
  for i in five_num:
    if (result % i == 0):
      count += 1
    
  if(count >= 3):
    break
  result += 1

print(result)