str = input("enter a string : ")
str2 = ""
count = 0
temp = ""
for i in str:
    if i not in temp:
        temp+=i
    elif i in temp:
        temp = ""
        temp+=i
    if len(temp)>len(str2):
        str2 = temp
print(f"Longest substing without repating characters in {str} is : {str2} ")