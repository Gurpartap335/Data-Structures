package leetcode.TwoPointers;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] arr = {2, 7, 8, 10, 11, 15};
        System.out.println(Arrays.toString(twoSumII.twoSum(arr, 1)));
    }


    // O(n), O(1)
    public int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }
}

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/2128501/Two-Pointers-or-Visual-Explanation-JAVA
