import random
import string
def coding(str):
    codeLs = []
    strLs = str.split()
    for word in strLs:
        if(len(word)<3):
            codeLs.append(word[::-1])
        else:
            word = word[-1] + word[1:-1] + word[0]
            word = ''.join(random.choices(string.ascii_lowercase,k=3))+word
            word = word+''.join(random.choices(string.ascii_lowercase,k=3))
            codeLs.append(word)
    code = ' '.join(codeLs)
    print("coded string is :\n",code)
def decoding(str):
    decodeLs = []
    strLs = str.split()
    for word in strLs:
        if len(word)<3:
            decodeLs.append(word[::-1])
        else:
            word = word[3:-3]
            word = word[-1] + word[1:-1] + word[0]
            decodeLs.append(word)
    decode = ' '.join(decodeLs)
    print("decoded string is :\n",decode)
print("1.code\n2.decode")
ch = int(input())
match ch:
    case 1:
        str = input("enter the string :\n")
        coding(str)
    case 2:
        str = input("enter string to decode :\n")
        decoding(str)
    case _ :
        print("invalid choice\n")