def palindrome(is_palindrome):
    reverse_string = ""  
    size_palindrome = len(is_palindrome) - 1  
    
    while size_palindrome >= 0:
        reverse_string = reverse_string + is_palindrome[size_palindrome]
        size_palindrome = size_palindrome-1
    if reverse_string == is_palindrome:
        print("Is Palindrome")
    else:
        print("NOT a Palindrome")
        
        
s = "radars"
palindrome(s)