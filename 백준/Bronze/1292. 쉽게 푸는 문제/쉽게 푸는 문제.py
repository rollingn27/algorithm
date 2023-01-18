start, end = map(int, input().split())

num_list = []

for i in range(1, end + 1):
  for j in range(i):
    num_list.append(i)

list_len = len(num_list)

sum_list = [0] * (list_len + 1)
for i in range(1, list_len + 1):  
  sum_list[i] = sum_list[i - 1] + num_list[i - 1]

print(sum_list[end] - sum_list[start - 1])