/*
https://leetcode.com/problems/search-in-rotated-sorted-array/
https://www.thealgorists.com/Algo/BinarySearch
 */
package leetcode.binarySearch;

import java.util.Arrays;
import java.util.Scanner;
//
//public class SearchInRotatedSortedArray {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter size of array : ");
//        int size = s.nextInt();
//
//        int[] nums = new int[size];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = s.nextInt();
//        }
//
//        System.out.println(Arrays.toString(nums));
//        System.out.println("Enter target : ");
//        int t = s.nextInt();
//        System.out.println(search(nums, t));
//    }
//
//    static int search(int[] arr, int target) {
//        int pivot = findPivot(arr);
//        if (pivot == -1) {
//            return binarySearch(arr,target);
//        }
//
//        if (arr[pivot] == target) {
//            return pivot;
//        }
//
//        if (target >= arr[0]) {
//            return binarySearch(arr,target);
//        }
//
//        return binarySearch(arr,4);
//    }
//
//    static int binarySearch(int[] arr, int target) {
//        int low = 0;
//        int end = arr.length - 1; // low and end will work like boundary.
//
//        while (low <= end) { // it is very important to put <= and not just < otherwise your program will give wrong answer
//            //  if the target happens to be the last element in the search space
//            int mid = end + (low - end)/2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//
//            else if (arr[mid] < target) { // if target is greater than mid element then low = mid + 1;
//                low = mid + 1;
//            }
//            else { // if arr[mid] element is greater than target then end = mid - 1;
//                end = mid - 1;
//            }
//
//        }
//        return -1;
//    }
//
//
//    static int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start)/2;
//
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }

//            if (start < mid &&  arr[mid] < arr[mid + 1]) {
//                return mid -1;
//            }
//            if (arr[mid] <= arr[start]) {
//                end = end - 1;
//            } else {
//                start = mid + 1;
//            }
//
//            return -1;
//        }
//    }
//
//
//}

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

//    static int search(int[] nums, int target) {
//        if (nums == null || nums.length == 0) return -1;
//
//        // find the index of the smallest element
//        int left = 0 , right = nums.length - 1;
//        int start = 0;
//        while (left < right) {
//            int mid = left + (right - left)/2;
//            if (nums[mid] > nums[right]) {
//                left = mid + 1;
//            } else right = mid;
//        }
//
//        // figure out in which side our target lies .
//        start = left;
//        left = 0;
//        right = nums.length-1;
//        if (target >= nums[start] && target <= nums[right])
//            left = start;
//        else right = start;
//
////        3. Run normal binary search in sorted half.
//        while(left <= right) {
//            int mid = left + (right - left)/2;
//            if (nums[mid] == target) return mid;
//
//            if (nums[mid] > target) right = mid-1;
//            else left = mid + 1;
//        }
//
//        return -1;
//    }
//
//}
/*
Find the index of the smallest element .
Figure out in right or left side of the smallest index the target lies.
Run normal binary search .
 */

class SearchRotatedArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

//        for (int i = 0; i < size; i++) {
//            arr[i] = s.nextInt();
//        }

        System.out.println(Arrays.toString(arr));

        System.out.println(targetInArray(arr, 0));
    }


    // finding where second array is starting if exits. or finding the maximum element in sorted rotated array.
    static int pivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s)/2;
            if (arr[m] > arr[m + 1]) { // out of bounds
                return arr[m];
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int s, int e, int t) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (t > arr[t]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static int targetInArray(int[] arr, int t) {
        int index = pivot(arr);
        int ans1 = binarySearch(arr,0, index, t);
        if ( ans1 == - 1) {
            if (binarySearch(arr, index + 1, arr.length - 1, t) == -1) {
                return -1; // element not found.
            } else {
                return binarySearch(arr, index + 1, arr.length - 1, t);
            }
        } else {
            return ans1;
        }
    }
}