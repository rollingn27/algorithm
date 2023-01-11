n, m = map(str, input().split())
n_str =""
m_str =""

for i in range(len(n) - 1, -1, -1):
  n_str += n[i]
for i in range(len(m) - 1, -1, -1):
  m_str += m[i]

print(n_str) if n_str > m_str else print(m_str)