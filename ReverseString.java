public class ReverseString {
    public static void main(String args[]) {

        String str = "GLOBANT";
        String reversedString = "";

        char newArray[] = str.toCharArray();
        int sizeArray = newArray.length - 1;

        for (int i = sizeArray; i >=0; i--) {
            reversedString = reversedString + newArray[i];
        }
        System.out.println("Reversed string is: "+reversedString);

    }
    
}
