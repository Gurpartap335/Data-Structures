package leetcode.sorting;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bucket sort
    // O(2n)
    public static void sortColors(int[] arr) {
        int red = 0, white = 0, blue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                red++;
            } else if (arr[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }


        for (int i = 0; i < red; i++) {
            arr[i] = 0;
        }

        for (int i = red; i < red + white; i++) {
            arr[i] = 1;
        }

        for (int i = red + white; i < arr.length; i++) {
            arr[i] = 2;
        }
    }


    // Dutch national flag algorithm
    // O(n)
    public static void sortColors2(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
/*
 0        ->  low-1    0
 low      ->  mid-1    1
 mid      ->  high     will unsorted array
 high + 1 ->  n - 1    2
 */

// https://www.youtube.com/watch?v=4xbWSRZHqac&t=119s&ab_channel=NeetCode