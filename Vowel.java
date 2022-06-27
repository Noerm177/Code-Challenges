public class Vowel {
    
    public static int getVowel(String s) {
        int vowels = 0;
        for (int i = 0; i < s.length();i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels ++;
            }
        } return vowels;
    }  
}
