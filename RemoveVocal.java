public class RemoveVocal {
    public static void main(String[] args) {

    }

    public static String remove(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' &&
                str.charAt(i) != 'i' &&                    
                str.charAt(i) != 'o' &&
                str.charAt(i) != 'u' &&
                str.charAt(i) != 'e') {
                
                output = output + str.charAt(i);
                }               
        } return output;
    }
}
