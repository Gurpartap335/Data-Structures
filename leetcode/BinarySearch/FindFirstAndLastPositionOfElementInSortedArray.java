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


class FindFirstAndLast{
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};


    }

    static int search(int[] nums, int target, boolean firstOccurence) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
    // debug
}




class first{
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};

        int ans = fAndLast(arr, 7, false);
        System.out.println(ans);
    }

    private static int fAndLast(int[] arr, int t, boolean firstOccurence) {
        int ans = -1; // -1 element did not exit.
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + e >>> 1;

            if (arr[mid] < t) {
                s = mid + 1;
            } else if (arr[mid] > t) {
                e = mid - 1;
            } else {
                ans = mid; // we only enter this condition we find the element. return mid as index.
                // we are returning mid as index for both first and last occurrence.
                if (firstOccurence) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }


}