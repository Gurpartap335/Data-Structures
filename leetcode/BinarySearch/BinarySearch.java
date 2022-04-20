package leetcode.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(binarySearch(nums,4));

    }

    static int binarySearch(int[] arr , int target) {
        int low = 0;
        int end = arr.length - 1;

        while (low <= end) {
            int mid = end + (low - end)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) { // if target is greater than mid element then low = mid d+ 1;
                low = mid + 1;
            }
            else { // if arr[mid] element is greater than target then end = mid - 1;
                end = mid - 1;
            }

        }
        return -1;
    }
}
/*
sorted array
 */