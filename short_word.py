def short(w):
    array = w.split(" ")
    minor = len(array[0])
    for index, x in enumerate(array):
        if minor < len(x[index]):
            minor = len(x[index])
        return minor

s = "lets we travel abroad "
print(short(s))