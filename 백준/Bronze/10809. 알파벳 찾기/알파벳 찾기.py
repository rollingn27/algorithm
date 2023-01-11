s = input()

alpa_idx = [-1] * 26

for i in range(len(s)):
  
  if(alpa_idx[ord(s[i]) - 97] != -1):
    continue
  alpa_idx[ord(s[i]) - 97] = i


for i in alpa_idx:
  print(i, end=' ')