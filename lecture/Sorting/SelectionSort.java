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
        selection3(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            // Find the minimum element in index in unsorted array.
            int iMin = i;
            // j = i + 1 no need to find minimum after we swap element their.
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[iMin])
                    iMin = j;// update the index of minimum element.
            }

//            // if minimum element index is similar to first element no need to swap.
//            if (iMin == i){
//                continue;
//            }
            // swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
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
}
/*
Sorting is arranging the elements in a list or collection in increasing or decreasing order of a some property
A sorted list is the permutation of the original list, when we sort a list, we just rearrange the elements.

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

/*
read github code.
 */
