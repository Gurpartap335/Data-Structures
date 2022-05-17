/*
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAndMinimumElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

//        maxAndMin(nums);
//        maxAndMin2(nums);
        maxAndMin3(nums);
    }


//    static void maxAndMin(int[] arr) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum element in array : " + min);
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Maximum element in array : " + max);
//    }

    static void maxAndMin2(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        System.out.println("Minimum element in array : " + min);

        int ma = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ma = Math.max(arr[i],ma);
        }
        /*
        public static int max(int a , int b) { here a = arr[i] b = ma
            return (a >= b) ?
        }
         */
        System.out.println("Maximum element in array : " + ma);
    }

    static void maxAndMin3(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { // if min value is greater than array i value then change the min value .
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array : " + min);


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // if arr[i] is greater than max then change the value of max .
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array : " + max);
    }
}
