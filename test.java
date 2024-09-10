import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String args[]) {
        String s = ("MCMXCIV");
        Map<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int before = 0;
        int after = 0;
        int result = 0;
        int counter = 0;
        while (!(counter == s.length())) {
            if (before == 0) {
                before = values.get(s.charAt(counter));
                after = values.get(s.charAt(counter));
                result += after;
            } else {
                after = values.get(s.charAt(counter));
                if (after - before == 4 || after - before == 9 ||
                        after - before == 40 || after - before == 90 ||
                        after - before == 400 || after - before == 900) {
                    result -= before;
                    result = after - before;
                } else {
                    result += after;
                }
                before = after;
            }
            counter++;
        }
        System.out.println(result);
    }
}
