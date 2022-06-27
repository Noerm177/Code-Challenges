public class Case {
    public static void main(String[] args) {
        String phrase = "how cAn mirror BE";
        System.out.println(toCase(phrase));
    }

    public static String toCase(String phrase) {
        char[] charArray = phrase.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 || charArray[i - 1] == ' ') {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else charArray[i] = Character.toLowerCase(charArray[i]);
        }
        return new String(charArray);
    }
}
