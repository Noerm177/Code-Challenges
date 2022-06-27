public class ShowMiddle {
    public static void main(String[] args) {
        System.out.println(getMiddle("sentences"));
    }

    public static String getMiddle(String sentence) {
        int size = sentence.length();
        int half = size / 2;
        int isEven = size % 2;

        if (isEven == 0) {
            return sentence.substring(half - 1, half + 1);
        } else {
            return Character.toString(sentence.charAt(half));
        }
    }
}
