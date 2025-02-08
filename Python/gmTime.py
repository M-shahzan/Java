import time
hr = int(time.strftime("%I",time.localtime()))
ti = time.strftime("%p",time.localtime())
if hr>=5 and hr<12 and ti == "AM":
    print("good morning")
elif hr == 12 or (hr>=1 and hr<4 and ti == "PM"):
    print("good afternoon")
elif hr>=4 and hr<8 and ti == "PM":
    print("good evening")
elif (hr >= 8 and hr < 12 and ti == "PM") or (hr >= 1 and hr < 5 and ti == "AM"):
    print("good night")