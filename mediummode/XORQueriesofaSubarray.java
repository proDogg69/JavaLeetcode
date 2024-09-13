// https://leetcode.com/problems/xor-queries-of-a-subarray/

package mediummode;

public class XORQueriesofaSubarray {
    public static void main(String[] args) {
        int arr[] = { 16 };
        int queries[][] = { { 0, 0 }, { 0, 0 }, { 0, 0 } };
        int[] result = new int[queries.length];
        int counter = 0;
        int left = 0;
        int right = 0;

        while (counter < queries.length) {
            left = queries[counter][0];
            right = queries[counter][1];
            if (left > right || arr.length < right) {
                break;
            }
            if (queries[counter][0] == queries[counter][1]) {
                result[counter] = arr[queries[counter][0]];
            } else if (left + right == 0) {
                result[counter] = arr[0];
            } else {
                result[counter] = arr[queries[counter][0]];
                for (int i = 1; i <= queries[counter][1] - queries[counter][0]; i++) {
                    result[counter] ^= arr[queries[counter][0] + i];
                }
            }
            counter++;
        }
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}