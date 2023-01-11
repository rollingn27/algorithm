count_list = [0] * 26

input_str = input().lower()


for i in range(len(input_str)):
  count_list[ord(input_str[i]) - 97] += 1


max_idx = 0
max_num = count_list[0]
for i in range(len(count_list)):
  if count_list[i] > count_list[max_idx]:
    max_idx = i
    max_num = count_list[i]


count_list.sort(reverse=True)

if(max_num == count_list[1]):
  print("?")
else:
  print(chr(max_idx + 97).upper())