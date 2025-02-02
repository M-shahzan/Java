def max(ls):
    max = ls[0]
    for i in ls:
        if(i>max):
            max = i
    print("biggest element : ",max)
    secLarge = 0
    for i in ls:
        if (i>secLarge and i!=max):
            secLarge = i
    print("sec largest element : ",secLarge)

def min(ls):
    min = ls[0]
    for i in ls:
        if(i<min):
            min = i
    print("smallest element : ",min)

def sum(ls):
    sum = 0
    for i in ls:
        sum += i
    print("sum : ",sum)
               
n = int(input("enter length of list : "))
ls = []
for i in range(n):
    ele = int(input())
    ls.append(ele)
max(ls)
min(ls)
sum(ls)
