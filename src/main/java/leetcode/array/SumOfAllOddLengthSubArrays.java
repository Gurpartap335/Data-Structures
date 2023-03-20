/*
https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllOddLengthSubArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));


    }

//    static int sumOddLengthSubArrays(int[] arr) {
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//
//            for (int j = 0; j < a; j++) {
//
//            }
//        }
//    }
}
/*
A subarray is a contiguous subsequence of arr .

Return the sum of all odd-length subarrays of arr.
 */
