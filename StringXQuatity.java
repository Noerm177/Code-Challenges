public class StringXQuatity {
    public static void main(String[] args) {
        String s = "abcdfg";
        System.out.println(accum(s));
    }

    public static String accum(String s) {

        StringBuilder str = new StringBuilder();
        int i = 0;
        for (char currentCharacter : s.toCharArray()) {
            if (i > 0)
                str.append('-');
            str.append(Character.toUpperCase(currentCharacter));
            for (int j = 0; j < i; j++)
                str.append(Character.toLowerCase(currentCharacter));
            i++;
        }
        return str.toString();
    }
}

//accum("abcd") -> "A-Bb-Ccc-Dddd"