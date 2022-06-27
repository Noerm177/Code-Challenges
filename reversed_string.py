def reversed_string(original_string):
    converted_string = ""
    size_original_string = len(original_string) -1

    while size_original_string >= 0:
        converted_string += original_string[size_original_string] 
        size_original_string -= 1
    return converted_string

s = "GLOBANT"
print(reversed_string(s))