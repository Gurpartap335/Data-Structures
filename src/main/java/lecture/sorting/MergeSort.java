package lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 9, 3, 2, 1, 5, 4};
        MergeSort sort = new MergeSort();
        System.out.println(Arrays.toString(arr));
        sort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
    public void mergeSort(int[] arr, int low, int high) {
        if (arr.length == 0) {
            return;
        }
        if (low == high) {
            return;
        }

        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low; // starting index of left of arr
        int right = mid + 1; // starting index of right half of arr

        while (left <= mid && right <= high) {
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

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        // low give us current index from where our current hypothetical array start
        // and high where its end.
        // temp.get(i - low) to start the indexing of temp from zero.
        // we are directly updating input array.

    }



}
/*
Merge Sort -> Divide and Merge

Time complexity : O(n * log2 n) -> O(n logn)
worst time complexity is also same for merge sort as of Quicksort.
Everytime getting divide by 2 -> log2
At each step we divide the whole array, for that logn and
we assume n steps are taken to get a sorted array.

Space complexity: O(n) temp array we are creating in merge method
in-place sorting algorithm.
 */