public class Case {
    public static void main(String[] args) {
        
    }

    public static String toCase(String phrase) {
        char[] charArray = phrase.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 || charArray[i -1] == ' ') {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        } return new String(charArray);
    }
}
