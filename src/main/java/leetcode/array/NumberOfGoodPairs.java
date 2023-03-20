/*
https://leetcode.com/problems/number-of-good-pairs/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int pair = 0;

        for (int i = 0; i < nums.length;i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    pair += 1;
                }
            }
        }

        return pair;
    }
}

