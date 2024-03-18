package leetcode.array.subarray;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestSubArray(new int[]{-2,1,-3,4,-1,2,1,-15, -14, 16})));
    }

    // O(n^3), O(1)
    public static int subArray(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currMax = 0;
                for (int k = i; k <= j; k++) {
                    currMax += arr[k];
                }
                max = Math.max(currMax, max);
            }
        }

        return max;
    }

    // O(n^2), O(1)
    public static int subArray1(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currMax = 0;
            for (int j = i; j < arr.length; j++) {
                currMax += arr[j];
                max = Math.max(currMax, max);
            }
        }

        return max;
    }

    // kadane's algorithm
    // O(n), O(1)
    public static int subArray2(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }


    // follow up: return subarray with the largest sum.
    public static int[] largestSubArray(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        int start = 0,subStart = 0, subEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {// whenever sum is 0 we're having new start
                start = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                subStart = start;
                subEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return Arrays.copyOfRange(arr, subStart, subEnd + 1);
    }


}

// instance vs object
// why we declare method static?
// we make method static then it can be used anywhere in the class(global access)
// but non-static method can be used only when we create object of the class.
// memory efficiency, object independence

// first practise (write code)more around static keyboard by yourself
// https://www.freecodecamp.org/news/static-variables-in-java/#:~:text=A%20static%20method%20means%20it,%2C%20performance%2C%20and%20code%20organization.
