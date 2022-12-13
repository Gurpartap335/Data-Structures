package neetcode.twoPointers;

// https://www.geeksforgeeks.org/two-pointers-technique/

import java.util.Arrays;

/**
 * Two pointer is technique that is typically used for searching pairs in sorted array.
 * Problem where we can use two pointers:
 * Given a sorted array find if there exists any pair of elements(a[i], a[j]) such
 * that their sum is equal to target element.
 */

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 1, 9, 11, 2, 7, 0, 1};
        System.out.println(Arrays.toString(twoSum(arr, 19)));
    }

    // naive approach using loops
    // Time complexity: O(n^2) Auxiliary Space: O(1)
    private static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
                if (arr[i] + arr[j] > target) { // if it's greater than break no need check further
                    break;
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] twoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            if (arr[i] + arr[j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}
// Time Complexity: O(n log(n)) As sort function is used O(n) if already sorted.
// Auxiliary Space: O(1)