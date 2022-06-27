public class AbbreviateWord {
    public static void main (String[] args){
        System.out.println(abbreviate("Same harris"));
    }
    
    public static String abbreviate(String name){
        String[] initials = name.split(" ");// Creamos un arreglo de strings separados
        return (initials[0].charAt(0) +"."+ initials[1].charAt(0)).toUpperCase();
    }
}
