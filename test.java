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
        int dummy = 0;
        int number = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (dummy == 0) {
                dummy = values.get(s.charAt(i));
                result += dummy;
            } else {
                number = values.get(s.charAt(i));
                if (number - dummy == 4 || number - dummy == 9 ||
                        number - dummy == 40 || number - dummy == 90 ||
                        number - dummy == 400 || number - dummy == 900) {
                    result -= dummy;
                    result += number - dummy;
                    dummy = 0;
                    System.out.println(result);
                } else {
                    result += number;
                    dummy = number;
                }
            }
        }
    }
}
// BETTER SOLUTION FROM OTHER SUBMISSIONS
// public int romanToInt(String s) {
// int ans = 0, num = 0;
// for (int i = s.length()-1; i >= 0; i--) {
// switch(s.charAt(i)) {
// case 'I': num = 1; break;
// case 'V': num = 5; break;
// case 'X': num = 10; break;
// case 'L': num = 50; break;
// case 'C': num = 100; break;
// case 'D': num = 500; break;
// case 'M': num = 1000; break;
// }
// if (4 * num < ans) ans -= num;
// else ans += num;
// }
// return ans;
// }
