"""def fibonacci(n):
    n1, next = 0, 0
    n2 = 0
    print("Series is : ")
    for i in range(0, n):
        next = n1 + n2
        print(next)
        if i == 0:
            n2 =+ 1      
        n1 = n2
        n2 = next
"""

"""""
def fibonacci(n):
    ls = []
    n1, n2, next = 0, 0, o
    for i in range(0, n):
        next = n1 + n2
        ls.append(next)
        if i == 0:
            n2 = + 1
        n1 = n2
        n2 = next
    return ls  """""
    
def fibonacci(n):
    a, b, fibo = 0, 1, []
    for i in range(n):
        fibo.append(a)
        a, b = b, a + b
    return fibo

print(fibonacci(4))
