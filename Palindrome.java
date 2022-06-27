public class Palindrome {

    public static void main(String[] args) {
        String isPalindrome = "accbcca";
        String reverseString = "";

        int indexPalindrome = isPalindrome.length() - 1;

        for (int i = indexPalindrome; i >= 0; i--) {
            reverseString = reverseString + isPalindrome.charAt(i);
        }

        if (reverseString.toLowerCase().equals(isPalindrome.toLowerCase())) {
            System.out.println("Is Palidrome");
        } else
            System.out.println("NOT PAlindrome");

    }

}
