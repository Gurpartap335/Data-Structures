package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] arr = {1, 2, 3, 4, 5};
        sort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // descending
    public void sortD(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
/*
Takes an element and place it in its current position.

TC : O(n^2) Best Case O(1)
SC: O(1)
 */
