package leetcode.array.subarray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {9, 12, 4, 1, 2, 3, 1, 5};
        System.out.println(longestSubArrayWithSum(arr, 6));
        System.out.println(longestSubArrayWithSum2(arr, 6));
        System.out.println(longestSubArrayWithSum3(arr, 6));
        System.out.println(longestSubArrayWithSum4(arr, 6));
    }

    // ~O(n^3), O(1)
    public static int longestSubArrayWithSum(int[] arr, int k) {

        int len = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    len = Math.max(len, end - start + 1);
                }
            }
        }
        return len;
    }


    // ~O(n^2), O(1)
    public static int longestSubArrayWithSum2(int[] arr, int k) {

        int maxLen = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }
        return maxLen;
    }

    // if negative number exits then this is optimal
    // O(n), O(n)
    public static int longestSubArrayWithSum3(int[] arr, int k) {

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // do not update if sum exists
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }


    // optimal solution when there is only zeros and positive
    // 2 pointer greedy
    // O(2n), O(1)
    public static int longestSubArrayWithSum4(int[] arr, int k) {

        int left = 0, right = 0, sum = arr[0], maxLen = 0;
        while (right < arr.length) {

            // till there is subarray and sum greater than given value
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return maxLen;
    }

    public static void subArray(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // recursive
}


/*
A subarray is contiguous part of any given array,
For an array/string of size n, there are n*(n+1)/2 non-empty subArrays/substrings
 */
// https://leetcode.com/discuss/study-guide/1353000/link-to-subarray-problems-for-practice
// https://www.freecodecamp.org/news/greedy-algorithms/

// debug two pointer code