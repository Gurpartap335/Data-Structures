/*
https://leetcode.com/problems/running-sum-of-1d-array/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static int[] runningSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1]; // arr[i] = arr[i] + arr[i - 1] , starting index is 1
        }
        return arr;
    }
}

// subArray is a contiguous part of array .