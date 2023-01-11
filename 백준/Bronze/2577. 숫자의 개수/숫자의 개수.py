count_list = [0] * 10

a = int(input())
b = int(input())
c = int(input())

numabc = str(a * b * c)

for i in range(len(numabc)):
  count_list[int(numabc[i])] += 1

for i in count_list:
  print(i)