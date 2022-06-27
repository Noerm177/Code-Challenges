import java.util.ArrayList;
import java.util.Collections;

public class HighAndLow {
    public static void main(String[] args) {
        String n = new String("1 2 3 4 5");
        System.out.println(highAndLow(n));
    }
    public static String  highAndLow(String numbers) {
        String[] num = numbers.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : num) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        return list.get(list.size() - 1) +" "+ list.get(0);
    }
}
