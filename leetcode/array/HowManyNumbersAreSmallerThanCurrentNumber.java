/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0;i < nums.length; i++) {
            int count = 0;
            for (int j = 0;j < nums.length; j++) {

                if (i == j) {
                    continue;
                }

                if (nums[i] > nums[j]) {
                    count += 1;
                }

            }

            ans[i] = count;

        }

        return ans;
    }
}
