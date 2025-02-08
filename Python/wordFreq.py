import re
f = open("file.txt","r")
wrdLs = f.read().split()
clrLs = []
srtLs = []
for word in wrdLs:
    nword = re.sub(r'[^a-zA-Z]','',word).lower()
    clrLs.append(nword)
for word in clrLs:
    if word not in srtLs:
        srtLs.append(word)
count = [0]*len(srtLs)
for word in wrdLs:
    for i in range(len(srtLs)):
        if srtLs[i] == word:
            count[i] +=1
for i in range(len(srtLs)):
    print(f"{srtLs[i]}\t: {count[i]}")