package leetcode.twoPointers;


import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] arr = {2, 7, 8, 10, 11, 15};
        System.out.println(Arrays.toString(twoSumII.twoSum(arr, 1)));
    }


    // TC : O(n)
    // SC : O(1)
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

/**
 * 1-indexed array
 * sorted
 * find two numbers such that they add up to a specific number.
 * 1 <= index1 < index2 < numbers.length
 */
