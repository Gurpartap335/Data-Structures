/*
Find position of an element in a sorted array of infinite numbers .

https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
package leetcode.BinarySearch;

import java.util.Scanner;

public class PositionOfAnSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(ans(arr,170));

    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            // end = previous end + size of box * 2;
            end = end +(end - start + 1) * 2; // +1 to take size of index which left 0 - 1 + 1 = 2 * 2 = 4
            if (end < arr.length) {
                end = arr.length - 1;
            }
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) { // it is very important to put <= and not just < otherwise your program will give wrong answer
            //  if the target happens to be the last element in the search space
            int mid = end + (start - end)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) { // if target is greater than mid element then low = mid + 1;
                start = mid + 1;
            }
            else { // if arr[mid] element is greater than target then end = mid - 1;
                end = mid - 1;
            }

        }
        return -1;
    }
}
/*
Array is infinite so we do not know bound of an array.
we need to find the search space where can we apply the binary search.

How to find search space? where can  i find our target element.

We also getting array out of bound. so we have to apply special condition.
 */
