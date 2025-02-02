import time
import os
n = int(input("enter timer in min : "))
for min in range(n-1,-1,-1):   
    for sec in range(59,-1,-1):
        os.system('cls')
        print(f"{min} : {sec}")
        time.sleep(1)