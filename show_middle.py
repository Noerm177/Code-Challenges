"""def get_middle(s):
    return s[(len(s)-1)//2: len(s)//2+1]
    """


def get_middle(s):
    size = len(s)
    half = size//2
    isEven = size%2
     
    if isEven == 0:
       return s[half-1 : half+1]
    else:
       return s[half]
        
print(get_middle("words"))
