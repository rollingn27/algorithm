n = int(input())
result = 0
data = list(map(int, input().split()))

min_num = min(data)
max_num = max(data)
result = min_num * max_num

print(result)