import java.util.HashMap;
import java.util.Map;

public class contarWords {
    public static void main(String[] args) {
        String string = "same word appears the same amount the times of word";
        System.out.println(contarHash(string));
    }

    public static String contarHash(String word) {
        String[] dictArray = word.split(" ");
        HashMap<String, Integer> dict = new HashMap<>();
        String duplicate_String = " ";
        
        for (int i = 0; i < dictArray.length; i++) {
            String key = dictArray[i];
            int frenq = dict.getOrDefault(key, 0);
            dict.put(key, frenq);
        }
        for (Map.Entry<String, Integer> result : dict.entrySet()) {
            //if 
            duplicate_String += ("\t"+result.getKey() + " : " + result.getValue()+"\n"); 
            
    } return new String(duplicate_String);
} 
}
