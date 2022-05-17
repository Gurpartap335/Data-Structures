package lecture.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
       int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped;
            // run the steps n-1 times
            for (int j = 0; j < n - i - 1; j++) {
                swapped = false;
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

                // if you did not swap for a particular value of i, it means the array is sorted
                if (!swapped) { // if no two elements were swapped by inner loop , then break.
                    break;
                }
            }
        }
    }

    static void bubble2 (int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    /*
    THE above function always runs O(n^2) time even if the array is sorted.
    It can be optimized by stopping the algorithm if the inner loop did not cause any swap.
     */
}
/*
Bubble Sort aka sinking sort/ exchange sort

why ?
With the first pass through the array the largest element come to end .

Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the
adjacent elements if they are in the wrong order.
- This algorithm is suitable for large data sets as its average and worst case time complexity is quite high.

In the worst case, the total number of iterations or passes required to sort a given array is (n - 1).
where n is a number of elements present in the array.

Two parts of array
one sorted
other unsorted.

Worst and Average case time complexity O(N^2)
Best case Time complexity: O(N) .
Auxiliary sorted O(1)
 */