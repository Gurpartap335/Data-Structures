package leetcode.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(minimum(arr));

    }

    static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) { //
                start = mid + 1;
            }
            else end = mid;
        }
        return arr[start];
    }

}
/*
In normal binary search we have a target to match exactly , and would have a specific branch
for if nums[mid] == target
we do not have specific target here so we just have simple if else .


 */