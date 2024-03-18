package leetcode.TwoPointers;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    // O(n), O(n)
    public static int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];

        int pos = 0, neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                temp[pos] = nums[i];
                pos += 2;
            } else {
                temp[neg] = nums[i];
                neg += 2;
            }
        }
        return temp;
    }

    // follow up: what if array does not contain equal numbers + and - integers.
//    public static int[] rearrangeArray2(int[] nums) {
//
//    }

}
