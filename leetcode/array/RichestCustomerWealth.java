package leetcode.array;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter row ");
        int r = s.nextInt();
        System.out.println("Enter col");
        int c = s.nextInt();


        int[][] arr = new int[r][c];

//        System.out.println(arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= s.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(maxWealth(arr));

    }

    static int maxWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;

//        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
