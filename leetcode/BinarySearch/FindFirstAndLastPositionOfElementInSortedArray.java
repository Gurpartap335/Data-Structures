package leetcode.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element : ");
        int t = s.nextInt();
        System.out.println(Arrays.toString(searchRange(arr,t)));


    }

    static int[] searchRange(int[] nums , int target) {
        int[] result = new int[2];

        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);
        return result;
    }

    static int findFirst(int[] nums, int target) {
        int id = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] >= target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            if (nums[mid] == target) id = mid;
        }
        return id;
    }

    static int findLast(int[] nums, int target) {
        int id = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if (nums[mid] == target) id = mid;
        }
        return id;
    }





}
