def abbrev_name(name):
    first_name, second_name  = name.upper().split(" ")
    print(first_name[0] +"."+second_name[0])
    
name = "sam Harris"
abbrev_name(name)
 
 
"""""
def abbrev(name):
    first_i = name[0]
    for letter in range(len(name)):
        if name[letter] == " ":
            second_i = name[letter + 1]
    return (first_i.upper() +"."+second_i.upper())

name = "sam H"
print(abbrev(name))
"""""