"""def vowel(a):
    return sum(1 for let in a if let in "aeiou")
"""


def vowel(a):
    count = 0 
    
    for x in a:
        if x in ("aeiou"):
            count +=1
    return count

s = "noerm abc"
print(vowel(s))