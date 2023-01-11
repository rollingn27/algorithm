num_count = int(input())
s = input()
s_list = []

for i in range(num_count):
  s_list.append(int(s[i]))

print(sum(s_list))