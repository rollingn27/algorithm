M, N = map(int, input().split())

ptr = 0
prime = [None] * 300000

prime[ptr] = 2
ptr += 1
prime[ptr] = 3
ptr += 1

for n in range(5, N + 1, 2):
  i = 1
  while prime[i] * prime[i] <= n:  
    if n % prime[i] == 0:
      break
    i += 1
  else:
    prime[ptr] = n
    ptr += 1       
    
for i in range(ptr):
  if M <= prime[i] <= N:
    print(prime[i])