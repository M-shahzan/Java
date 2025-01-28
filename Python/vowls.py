vowels = ['a','e','i','o','u']
wrd = input("enter the word : ")
count = 0
for i in wrd:
    for j in vowels:
        if(i==j):
            count+=1
print(f"no.of vowels in {wrd} : {count}")