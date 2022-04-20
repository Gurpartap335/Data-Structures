/*
https://leetcode.com/problems/concatenation-of-array/submissions/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcentrationOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i = 0;i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
            // ans[i + n] = nums[i];
        }
        return ans;

    }



}
