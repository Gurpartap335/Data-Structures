package lecture.binarySearch;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FIndFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search(new int[]{5, 6, 6, 7, 7, 7, 8, 8}, 8)));
    }

    public static int[] search(int[] arr, int target) {
        int a = firstPosition(arr, target);
        int b = lastPosition(arr, target);
        return new int[]{a, b};
    }


    public static int firstPosition(int[] arr, int target) {
        // corner case
        if (arr.length == 0) {
            return -1;
        }

        // array out of bound for first element
        if (arr[0] == target) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static int lastPosition(int[] arr, int target) {

        // corner case
        if (arr.length == 0) {
            return -1;
        }

        // array out of bound for last element
        if (arr[arr.length - 1] == target) {
            return (arr.length - 1);
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                if (arr[mid] < arr[mid + 1]) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
