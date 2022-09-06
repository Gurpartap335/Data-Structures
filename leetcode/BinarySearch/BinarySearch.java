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

        System.out.println("Enter target element : ");
        int t = s.nextInt();
        System.out.println(binarySearch(nums,t));

    }

    static int binarySearch(int[] arr , int target) {
        int low = 0;
        int end = arr.length - 1; // low and end will work like boundary.

        while (low <= end) { // it is very important to put <= and not just < otherwise your program will give wrong answer
            //  if the target happens to be the last element in the search space
            int mid = end + (low - end)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) { // if target is greater than mid element then low = mid + 1;
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

Binary search is all about
finding minimum value in the search space for which certain condition satisfies.

search space and condition to satisfy .
This range of possible values is called Search space .

 */