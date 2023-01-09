n = int(input())
data = []

for _ in range(n):
  data.append(input())

file_len = len(data[0])

answer = result = data[0]

result_list = list(result)

for i in range(file_len):
  for j in range(1, len(data)):
    if(data[j - 1][i] != data[j][i]):
      result_list[i] = '?'
      answer = "".join(result_list)
print(answer)