/*
https://leetcode.com/problems/richest-customer-wealth/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int r = s.nextInt();

        System.out.println("Enter the num3ber of columns : ");
        int c = s.nextInt();
        int[][] nums = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nums[i][j] = s.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(nums)); // used for print to 2d array .

        print2D(nums);


        System.out.println(maximumWealth(nums));
    }

    static int maximumWealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE; // initialize the maximum wealth seen so far(the minimum wealth possible).

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // for each account , initialize the sum to 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            maxi = Math.max(sum,maxi); // update the maximum wealth seen so far if the current wealth is greater than the current sum .
        }

        return maxi;
    }

    static void print2D(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // loop through all elements of current row .
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
m rows ---
n columns |
rows i changes
columns j changes
 */