/*
https://leetcode.com/problems/search-insert-position/
 */
package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
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

        System.out.println(searchInsertPosition(arr,key));



    }

    static int searchInsertPosition(int[] arr , int target) {
        if(arr == null || arr.length == 0) return 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                end = mid -1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
//        return arr[end] < target ? end + 1: end;
    }
}
