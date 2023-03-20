/*
Find Numbers with Even number of digits

given an array nums of integers , return  how many of them contain an even number of digits .

https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

package lecture.array.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter element of array : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += numberLength(nums[i]);
        }
        return ans;

    }

    static int numberLength(int n) {

        int count = 0;

        while (n > 0) {
            count += 1;
            n /= 10;
        }

        int ans = 0;
        if (count % 2 == 0) {
            ans += 1;
        }
        return ans;


    }



}
