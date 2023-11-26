/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
package leetcode.binarySearch;


public class PeakIndexInAMountainArray {
    public static void main(String[] args) {

    }


    // returning index of peak element.
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) { // we need to include that element.
                end = mid;
            }
            else if (arr[mid] < arr[mid + 1]) { // if arr[m+1] is greater than arr[m] then we don't need to include that element so s = m + 1.
                start = mid + 1;
            }
        }

        return start; // or end
    }
}
/*
Intuition
Array is this pattern
a[0] < a[1] < .... < a[i - 1] < a[i] > a[i+1] > .. a[a.length - 1]
array first half is in ascending order and other half is in descending order.

In this array our target is  Peak element's index.
In Binary search  reduce the search space.
 */