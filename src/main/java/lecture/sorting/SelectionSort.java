package lecture.sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int @NotNull [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int iMin = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[iMin])
                    iMin = j; // update the minimum element index.
            }

            if (iMin != i) { // if minimum element index and i are same then skip.
                int temp = arr[i];
                arr[i] = arr[iMin];
                arr[iMin] = temp;
            }
        }
    }


    // descending order
    static void selection3(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int iMax = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[iMax] < arr[j])
                    iMax = j;
            }

            int temp = arr[i];
            arr[i] = arr[iMax];
            arr[iMax] = temp;
        }
    }

    // recursive
    static void selectionR(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                selectionR(arr, r, c + 1, c);
            } else {
                selectionR(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r -1] = temp;
            selectionR(arr, r - 1, 0, 0);
        }
    }
}


/*
Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum
element from unsorted part and putting it at the beginning(if sorting in
ascending order).

Initialize minimum value(iMin) to location 0.
traverse tha array to find the minimum element in the array.
while traversing if any element smaller than iMin is found then swap both the
values.
- then increment iMin to point to next element
repeat until array is sorted

Time Complexity : O(n^2).

Space complexity : O(1).
 */


/*
My understanding of selection sort algorithm.

Selection sort is a sorting algorithm which means we arrange data in ascending
or descending order.
we use two nested for loops. After declaring first for loop we initialize
iMin variable which stores the index of minimum element in list.
Then we declare another for loop in which we compare it with every element
find the minimum element in list.
Then we swap the iMin value to the first element in array.

First we let first element is minimum element if sorting in asc order then
we compare it with unsorted array and find minimum element then swap it with
beginning element(put it in sorted array). we repeat this until we sort the array.

Time complexity for selection is similar in three cases best average worst is O(n^2).
 */
