package lecture.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr= {6, 2, 8, 4, 10};
        sort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // recursive
    // r : arr.length - 1 for array getting out of bound
    // c : always start from first element.
    // largest element end up in last so keep decreasing area in which we have to find the largest element and place it
    // in the last position. so r - 1
    static void bubbleR(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleR(arr, r, c + 1);
        }
        else {
            bubbleR(arr, r - 1, 0);
        }
    }


}
/*
Bubble Sort aka sinking sort/ exchange sort
Pushes the maximum to the last by ADJACENT swaps.

why?
With the first pass through the array the largest element come to end.

Bubble sort is the simplest sorting algorithm that works by repeatedly swapping
the adjacent elements if they are in the wrong order.
- This algorithm is not suitable for large data sets as its average and worst case
time complexity is quite high.

In the worst case, the total number of iterations or passes required to sort
a given array is (n - 1). where n is a number of elements present in the array.

Two parts of array
one sorted
other unsorted.

It only takes one iteration to detect that a collection is already sorted.

Worst and Average case time complexity O(N^2)
Best case Time complexity: O(N)
Space Complexity O(1)
 */

/*
Number of swaps :
In ascending order:
largest element moves to the right.
so swapping is done when a smaller element is found on the right side.
count number of elements smaller than it.

https://stackoverflow.com/questions/20035505/bubble-sort-number-of-swaps
 */