/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(peakIndexInMountainArray(arr));
    }


    // returning index of peak element.
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int m = 0;
        while (s < e) {
            m = s + e >>> 1;

            if (arr[m] > arr[m + 1]) { // we need to include that element.
                e = m;
            }
            else if (arr[m] < arr[m + 1]) { // if arr[m+1] is greater than arr[m] then we no need to include that element so s = m + 1.
                s = m + 1;
            }
        }

        return s; //or e
    }
}
/*
Intuition
Array is this pattern
a[0] < a[1] < .... < a[i - 1] < a[i] > a[i+1] > .. a[a.length - 1]
array first half is in ascending order and other half is in descending order.

In this array out target is  Peak element's index.
In Binary search  reduce the space.
 */