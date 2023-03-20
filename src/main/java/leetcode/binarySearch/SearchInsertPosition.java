/*
https://leetcode.com/problems/search-insert-position/
 */
package leetcode.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println("Enter search element : ");
        int key = s.nextInt();
        System.out.println(searchInsert(nums,key));

    }

    static int searchInsert(int[] arr , int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return low;
    }
}
