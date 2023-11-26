
package leetcode.binarySearch;

/*
https://leetcode.com/problems/search-insert-position/
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{-1,0,3,5,9,12}, -5));

    }

    static int searchInsertPosition(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (arr[mid] == target) {
                return mid;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

// edge case if target is less than first element
// or target is greater than last element in an array
