package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {


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
