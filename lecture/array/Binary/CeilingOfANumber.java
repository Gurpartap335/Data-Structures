/*
Sorted array apply Binary Search .

ceiling number : smallest element in array greater or equal to target .

similar question
https://leetcode.com/problems/search-insert-position/
 */
package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfANumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter target element : ");
        int key = s.nextInt();

        System.out.println(ceilingOfNumber(arr, key));
        System.out.println();
        System.out.println(floor(arr,key));

    }

    static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return end;
    }


}
