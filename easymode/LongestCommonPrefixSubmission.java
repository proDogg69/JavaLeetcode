package easymode;

import java.util.Arrays;

public class LongestCommonPrefixSubmission {

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        String v[] = { "ab", "ac", "ad", "aa" };
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                System.out.println(ans.toString());
            }
            ans.append(first.charAt(i));
        }
        System.out.println("Final" + ans.toString());
    }
}
