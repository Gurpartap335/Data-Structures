/*
https://leetcode.com/problems/shuffle-the-array/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(shuffleArray(nums,nums.length/2)));
    }

    static int[] shuffleArray(int[] nums , int n) {
        int[] res = new int[2*n];

        for (int i = 0; i < n; i++) {
            res[2*i] = nums[i];
            res[2*i + 1] = nums[n + i];
        }
        return res;
    }
}
