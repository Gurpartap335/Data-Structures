package lecture.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {

       // we need to do n - 2 passes // no need to reverse last element with first element . array is already sorted.
        for (int i = 0; i < arr.length - 1; i++) {

            // Find the minimum element in unsorted array.
            int iMin = i;
            // j = i + 1 no need to find minimum after we swap element their.
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[iMin])
                    iMin = j;// update the index of minimum element.
            }

            // swap the found minimum element with the first element
            if (iMin == i){
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }
}
/*
Sorting is arranging the elements in a list or collection in increasing or
decreasing order of a some property
A sorted list is the permutation of the original list, when we sort a list, we just rearrange
the elements.

Sorting Algorithms :
Bubble sort
Selection sort
Insertion sort
Merge sort
Quick sort
Heap Sort
Counting sort
Radix sort

Classification:
1. Time complexity
2. Space Complexity or Memory usage
3. stability
4. Internal sort vs External sort
5. Recursive or Non recursive
 */

/*
Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted
part and putting it at the beginning.

Initialize minimum value(iMin) to location 0.
traverse tha array to find the minimum element in the array.
while traversing if any element smaller than iMin is found then swap both the values.
- then increment iMin to point to next element
repeat until array is sorted

Time Complexity : O(n^2).
 */
