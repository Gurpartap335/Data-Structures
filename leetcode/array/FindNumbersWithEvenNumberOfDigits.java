package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(findNumbers(nums));


    }

    static int findNumbers(int[] arr) {

        int count = 0;
        int sum =  0;

        for (int i = 0; i < arr.length; i++) {
            count = digitCount(arr[i]);
            if (count % 2 == 0) {
                sum += 1;
            }
        }
        return sum;
    }

    static int digitCount(int a) {
        int count = 0;

        while (a > 0) {
            a /= 10;
            count += 1;
        }
        return count;
    }

}
