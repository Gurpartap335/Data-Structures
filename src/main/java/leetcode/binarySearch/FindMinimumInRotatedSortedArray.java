/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
package leetcode.binarySearch;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }

    static int findMinimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;// include mid-element in search space it can be minimum number
                // not end = mid - 1; it excludes mid-element form search space.
            }
        }
        return arr[start]; // or end both pointer will be at same index
    }

}