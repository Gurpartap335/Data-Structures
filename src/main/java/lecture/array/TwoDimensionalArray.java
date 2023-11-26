package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional array can be defined in simple words as array of arrays.
        /*
        data_type[1st dimension][2nd][nth] array_name = new data_type[size1][size2]..[sizeN];
         */

//        int[][] arr = { {1,2} , {3,4} , {5, 6, 7, 8, 9}};

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
////                System.out.println("arr["+ i + "][" + j + "] = " + arr[i][j]);
////                System.out.print(arr[i][j] + " ");
//            }
//        }

//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        // 3d array
//        int[][][] arr2 = {
//                {{1, 2} , {3,4}} ,
//                {{5,6} , {7,8}} ,
//                {{9, 10} , {11 , 12}}
//        };
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(Arrays.toString(arr2[i][j]));
//            }
//        }

//        Scanner s = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = s.nextInt();
//            }
//        }
//
//        System.out.println(arr[0].length);
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



//        int maxi = Integer.MIN_VALUE;
//        System.out.println(maxi);

        int[][] arr = new int[5][2];
        System.out.println(arr.length);

        int[][] arr2 = {
                {1,2,3,4,5},
                {2,3,4,5,6}
        };
        System.out.println(arr2.length);

    }
}
