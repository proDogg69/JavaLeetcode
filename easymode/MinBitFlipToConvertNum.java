package easymode;

public class MinBitFlipToConvertNum {
    public static void main(String args[]) {
        int start = 10;
        int goal = 7;
        int ans = 0;
        int xor = start ^ goal;
        // System.out.println(xor);
        while (xor != 0) {
            ans += xor & 1;
            // System.out.print(ans + " ");
            xor >>= 1;
            // System.out.println(xor);
        }
        System.out.println(ans);
    }
}

// Cocept
// 10 => 1 0 1 0
// 7 => 0 1 1 1
// XOR those two
// result = 13 => 1 1 0 1
// HERE, this is the trick here
// the bits that are "1" are the answer
// the number of times require to flip to get a 7
// so, to do that
// we will perform a AND operation with 0 0 0 1
// which is the decimal number 1
// so the result 13 => 1 1 0 1
// and the AND operation with 1 => 0 0 0 1
// result is 0 0 0 1 right?
// thats one flip of a bit
// now shift the bits to right by 1 place.
// 1 1 0 1 becomes 0 1 1 0
// do the flipping again
// 0 1 1 0 and 0 0 0 1 . this times theres not flip
// shift again
// 0 0 1 1 and 0 0 0 1. theres a flip
// shift again
// 0 0 0 1 and 0 0 0 1. theres a flip
// shift again
// 0 0 0 0 and 0 0 0 1. theres no flip
// THE END
// So, there's a total of 3 flips
// Thats the answer
// Credit the original sub to raghavagarwal28 on leetcode
