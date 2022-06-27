public class ShortWord {
    public static void main(String[] args) {
        
    }

    public static int findShort(String s) {
        String[] aArray = s.split("\\s+");
        int size = aArray[0].length();

            for (int i = 1; i < aArray.length; i++) {
                if (aArray[i].length() < size) {
                    size = aArray[i].length();
                }
            }return size;
    }

}
