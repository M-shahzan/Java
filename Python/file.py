with open('f2.txt','a') as f:
    str = ""
    print("enter lines :")
    while(1):
        str = input()
        if str == "exit":
            break
        f.write(f"{str}\n")