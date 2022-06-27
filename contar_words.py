#Count the ocurrences on string
#
def count_s(string):
    string = string.lower().split(" ") # Volverlo lista separada
    W_count = {} # En diccionario lo guardamos

    for i in string:
        if i in W_count: # si existe en el diccionario
            W_count[i] +=1 # sumarle el valor un 1
        else:
            W_count[i] = 1 # Creamos el primer valor del diccionario
    return W_count


string = "same word appears the same amount the times of word"
print(count_s(string))
   
    