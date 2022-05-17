/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
https://www.thealgorists.com/Algo/BinarySearch
 */
package leetcode.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Enter target : ");
        int t = s.nextInt();
        System.out.println(search(nums,t));
    }

//    static int search(int[] nums , int target) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = (start + end)/2;
//            if (nums[mid] == target) {
//                return mid;
//            }
//
//            if (nums[start] <= nums[mid]) {
//                if (target < nums[mid] && target >= nums[start]) {
//                    end = mid - 1;
//                }
//                else start = mid + 1;
//            }
//
//            if (nums[mid] <= nums[end] ){
//                if (target > nums[mid] && target <= nums[end]) {
//                    start = mid + 1;
//                }
//                else
//                    end = mid - 1;
//
//            }
//        }
//        return -1;
//    }

    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        // find the index of the smallest element
        int left = 0 , right = nums.length - 1;
        int start = 0;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else right = mid;
        }



        // figure out in which side our target lies .
        start = left;
        left = 0;
        right = nums.length-1;
        if (target >= nums[start] && target <= nums[right])
            left = start;
        else right = start;

//        3. Run normal binary search in sorted half.
        while(left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target) right = mid-1;
            else left = mid + 1;
        }

        return -1;
    }

}
/*
Find the index of the smallest element .
Figure out in right or left side of the smallest index the target lies .
Run normal binary search .
 */