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
        bubbleSort(arr);
//        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) //
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break it means array is already sorted.
            if (!swapped)
                break;
        }
    }

    // descending order
    static void bubble(int[] arr) {
       int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            // run the steps n-1 times
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted
            if (!swapped) { // if no two elements were swapped by inner loop , then break.
                break;
            }

        }
    }

    // if descending order just change the symbol.
    static void bubble2 (int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
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


    // not improved

}
/*
Bubble Sort aka sinking sort/ exchange sort

why ?
With the first pass through the array the largest element come to end.

Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the
adjacent elements if they are in the wrong order.
- This algorithm is suitable for large data sets as its average and worst case time complexity is quite high.

In the worst case, the total number of iterations or passes required to sort a given array is (n - 1).
where n is a number of elements present in the array.

Two parts of array
one sorted
other unsorted.

It only takes one iteration to detect that a collection is already sorted.

Worst and Average case time complexity O(N^2)
Best case Time complexity: O(N) .
Auxiliary sorted O(1)
 */

/*
Number of swaps :
In ascending order:
largest element moves to the right.
so swapping is done when a smaller element is found on the right side.
count number of elements smaller that it.

https://stackoverflow.com/questions/20035505/bubble-sort-number-of-swaps
 */