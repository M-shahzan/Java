wrd = input("enter the string to check : ")
wrdRev = wrd[::-1]
if(wrd == wrdRev):
    print("it is a palindrome")
else:
    print("it is not a palindrome")