package lecture.array.Linear;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 18, 9};

        int ans = linearSearch(arr, 4);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr , int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
/*
Best Case O(1),
Worst Case O(N)
 */

