str1 = input("enter the word 1 : ")
str2 = input("enter the word 2 : ")
srtStr1  = [i for i in str1.lower()]
srtStr2 = [i for i in str2.lower()]
temp = ""
for i in range(len(srtStr1)):
    for j in range(len(srtStr1)):
        if srtStr1[j]>srtStr1[i]:
            temp = srtStr1[i]
            srtStr1[i] = srtStr1[j]
            srtStr1[j] = temp
for i in range(len(srtStr2)):
    for j in range(len(srtStr2)):
        if srtStr2[j]>srtStr2[i]:
            temp = srtStr2[i]
            srtStr2[i] = srtStr2[j]
            srtStr2[j] = temp
if srtStr1 == srtStr2:
    print(f"{str1} is an anagram of {str2}")
else:
    print(f"{str1} is not an anagram of {str2}")