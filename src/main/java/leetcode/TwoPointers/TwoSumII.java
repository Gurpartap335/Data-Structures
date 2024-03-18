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
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return null;
    }

    // binary search
    // hashing
}
/*
when the input array is sorted:
Binary Search
Two (or three) pointers
sliding window
Traversing from the right

see if negative and duplicate values are allowed.
 */