import random
import string
list = ['a','t','R','1','3',"_"]
a,b = (random.choices(list,k=2))
print(*[i for i in list if i not in string.__annotations__])