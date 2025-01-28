wrd = input("enter the sntence : ")
wrd2 = ""
wrdList = wrd.split()
for i in range(len(wrdList)-1,-1,-1):
    wrd2 += wrdList[i]+" "
print("reversed sentence is :\n",wrd2)
