package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingImage {
    public static void main(String[] args) {

    }

//    static int[][] flippingImage(int[][] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int lo = 0 , hi = arr.length - 1;
//            while (lo <= hi) {
//                if (arr[i][lo] == arr[i][hi]) {
//                    arr[i][lo] = 1 - arr[i][lo];
//                    arr[i][hi] = arr[i][lo];
//                }
//                lo++;
//                hi--;
//            }
//        }
//        return arr;
//
//    }

    static int[][] flippingImage2(int[][] arr) {
        int n = arr.length;
        int[][] result = new int[n][n];

        // revert
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[i][n - j - 1];
            }
        }

        // invert
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                if (result[i][j] == 0) {
//                    result[i][j] = 1;
//                }
//                else {
//                    result[i][j] = 0;
//                }
                result[i][j] = result[i][j] == 1 ? 0 : 1;

            }
        }

        return result;

    }


}
/*
For each row use two pointers. one is going forward and the other is going backward.

1. if the two elements are the same then make a slight change  like this 0 -> 1 and 1 -> 0
2 if the two elements are different , Don't do anything .just let it go.

 */
/*
Two pointers technique

Two pointers is really an easy and effective technique i.e. is typically used for searching pairs in a sorted array .

 */
