public class Mask {
    public static void main(String[] args) {
        String s = "123456789";
        System.out.println(maskify(s));
        
    }

    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }return result + str.substring(str.length()-4);
    } 
}
