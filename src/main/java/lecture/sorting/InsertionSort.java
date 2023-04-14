package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 1, 8, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }


    // kunal code
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

             for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // descending
    static void sortD(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
/*
O(n^2) comparisons and swaps

Best O(n) O(1) swaps if array is already sorted.
 */
