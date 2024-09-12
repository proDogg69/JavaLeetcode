//Problem
//a string named allowed is given which in this case is "ab"
//and words array is given
//if the member of the array has the char NON other than "a" and "b"
//then its Consistent
//but IF not, then False which means its not consistent
//so if the member of array is "ad", then its not consistent
//because the allowed char is only 'a' and 'b' not 'd'.

package easymode;

import java.util.HashMap;

public class CountNumOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String words[] = { "ad", "bd", "aaab", "baa", "badab" };
        HashMap<Character, Integer> map = new HashMap<>();
        int result = words.length;

        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), 1);
        }

        for (int j = 0; j < words.length; j++) {
            for (int k = 0; k < words[j].length(); k++) {
                if (map.get(words[j].charAt(k)) == null) {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
