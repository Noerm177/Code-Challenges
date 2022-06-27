public class StringRepeat {

    public static void main (String[] args){
        
        System.out.println(repeatStr(4, "Z"));  
    }

    public static String repeatStr(final int repeat, final String string){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i ++){
            sb.append(string);
        }
        return sb.toString();
    }
}
