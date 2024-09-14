// code credit to Rarma on Leetcode

package mediummode;

public class longestsubarrwithMaxValue {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int len = 1;

        // Step 1: Find the maximum element in the array
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num); // O(n)
        }

        // Step 2: Find the longest subarray consisting of the maximum element
        int tmp_len = 0;
        for (int num : nums) { // O(n)
            if (num == mx) {
                tmp_len++;
            } else {
                len = Math.max(len, tmp_len);
                tmp_len = 0;
            }
        }

        // Update len in case the longest subarray is at the end
        len = Math.max(len, tmp_len);
        System.out.println(len);
    }
}
