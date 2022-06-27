def case(s):
    return " ".join(w.capitalize() for w in s.split())


def case_string(s):
    new_s= " "
    
    for index, i in enumerate(s):
        if index == 0 or s[index-1] == " ":
            new_s += s[index].upper()
        else:
            new_s += i.lower()
    return new_s

n = "how cAn mirror BE"
print(case_string(n))