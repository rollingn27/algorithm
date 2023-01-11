num_list = list(map(int, input().split()))

sort_list = sorted(num_list)
reverse_sort = sorted(num_list, reverse=True)


if num_list == sort_list:
  print("ascending")
elif num_list == reverse_sort:
  print("descending")
else:
  print('mixed')