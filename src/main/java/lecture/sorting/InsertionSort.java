package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] arr = {2, 0, 2, 1, 1, 0};
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

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // TC : O(n^2) for loop + n times function get called
    // SC : O(n)
    public void recursiveInsertionSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return;
        }
        for (int j = i + 1; j > 0; j--) {
            if (arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
            } else {
                break;
            }
        }

        recursiveInsertionSort(arr, i + 1);
    }

}
/*
Takes an element and place it in its current position.

TC: O(n^2) Best Case O(n)
SC: O(1)
 */
