package lecture.array.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = s.nextInt();

        System.out.println("Enter number of columns : ");
        int column = s.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        int[] ans = search(arr,45);
//        System.out.println(Arrays.toString(ans));

        System.out.println("Maximum value " + max(arr));
//        System.out.println("Minimum value " + min(arr));

    }


    //searching in 2d array
    // returning index
    static int[] search(int[][] arr , int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j}; // creating object with new keyboard .
                }
            }
        }
        return new int[]{-1,-1};
    } // how to return array in method .

    // for maximum value index + value
    static int max(int[][] arr) {
        int max = arr[0][0];

        for(int[] ints : arr) {
            for (int element :
                    ints) {
                max = element;
            }
        }
        return max;

    }



    // for minimum value + index
    static int min(int[][] arr) {
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }

        return min;

    }
}
