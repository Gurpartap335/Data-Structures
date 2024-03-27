package lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        MergeSort sort = new MergeSort();
        System.out.println(Arrays.toString(arr));
        sort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void mergeSort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public void divide(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return;
        }
        if (start == end) {
            return;
        }

        int mid = (start + end)/2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

}

// Base case is when we only when one element left.
// start give us current index from where our current hypothetical array start
// and end where its end.
// temp.get(i - start) to start the indexing of temp arraylist from zero.

/*
Merge Sort -> Divide and Merge

Time complexity : O(n * log2 n) -> O(n logn) log 2 base n
worst time complexity is also same for merge sort as of Quicksort.
Everytime getting divide by 2 -> log2
At each step we divide the whole array, for that logn and
we assume n steps are taken to get a sorted array.

Space complexity: O(n) temp array we are creating in merge method
in-place sorting algorithm.
 */

// draw recursion tree