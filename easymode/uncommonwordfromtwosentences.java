//https://leetcode.com/problems/uncommon-words-from-two-sentences/description/

package easymode;

import java.util.ArrayList;
import java.util.Arrays;

public class uncommonwordfromtwosentences {
    public static void main(String arg[]) {
        String s1 = "gw pk xy";
        String s2 = "gw aje zqd";
        String s = s1 + " " + s2;
        String[] l = s.split(" ");
        String[] l3 = new String[l.length];
        int counter = 0;
        for (String a : l) {
            l3[counter] = a;
            counter++;
        }
        Arrays.sort(l3);
        int error = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < l3.length - 1; i++) {
            if (l3[i].equals(l3[i + 1])) {
                error = 0;
            } else {
                error++;
            }
            if (error > 1) {
                result.add(l3[i]);
            }
        }
        if (!(l3[l3.length - 1].equals(l3[l3.length - 2]))) {
            result.add(l3[l3.length - 1]);
        }
        if (!(l3[0].equals(l3[1]))) {
            result.add(l3[0]);
        }
        System.out.println(result);
    }
}
