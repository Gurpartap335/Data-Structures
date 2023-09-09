package lecture.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,0,8,22,9,-1,-3,-5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            // now my pivot is at correct index, please sort two halves now
            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }


    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
/*
1. Pick a pivot and place it in its correct position in the sorted array.
2. Smaller on the left and larger on the right.

TC : O(n log n) in worst case O(n^2)
SC : O(1)
This divide and conquer algorithm.


Hybrid sorting algorithm
Tim sort -> Merge sort + insertion sort
 */