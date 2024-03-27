package lecture.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 9, 2, 3};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
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
}
/*
1. Pick a pivot and place it in its correct position in the sorted array.
2. Smaller on the left and larger on the right.

Pivot can be:
first element in the array
last element in the array
median element of the array
random element of the array

TC : O(n log n) in worst case O(n^2)
SC : O(1)
This divide and conquer algorithm.


Hybrid sorting algorithm
Tim sort -> Merge sort + insertion sort
 */