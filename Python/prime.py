import math
num = int(input("enter the number to check : "))
cond = True
if (num<=1):
    print(f"{num} is not a prime number")
    exit(1)
for i in range (2,int(math.sqrt(num))+1):
    if (num%i==0):
        cond = False
if(cond==True):
    print(f"{num} is a prime number")
else:
    print(f"{num} is not a prime number")