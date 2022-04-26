package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int r = s.nextInt();

        int[][] nums = new int[r][r];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = s.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(nums));

        System.out.println((diagonalSum(nums)));
    }

    static int diagonalSum(int[][] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i] + arr[i][n -i -1]; // primary diagonals are rows = column . secondary diagonals are column[n - i - 1]
        }

        if (n % 2 != 0) {
            sum -= arr[n/2][n/2]; // if n is a odd number , that mean we have added the center element twice .
        }

        return sum;
        // return n % 2 == 0 ? sum : sum - arr[n/2][n/2]
    }

}
