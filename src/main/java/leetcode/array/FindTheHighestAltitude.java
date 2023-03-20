/*
https://leetcode.com/problems/find-the-highest-altitude/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(largestAltitude(nums));
    }

    static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum,max); // max never be negative . (highest altitude always = 0)
        }

        return max;
    }

}
