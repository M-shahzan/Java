num = input("enter the number : ")
numList = [int(i) for i in num]
sum = 0
for i in numList:
    sum+=i
print(f"sum of {num} is {sum}")