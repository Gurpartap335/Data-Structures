package leetcode.binarySearch;

//https://leetcode.com/problems/kth-missing-positive-number/

import java.util.Arrays;

public class kthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 11};
        int[] arr2 = new int[8];

        int i = 0, j = 1, k = 0, in = 1;
        while (i < arr.length ) {

                if (arr[i] == in) {
                    i++;
                    in++;
                } else {
                    arr2[k] = in;
                    k++;
                    j++;
                    in++;
                }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
/*
1. create a new array that stores the missing values from the given array.
 */

/*
0 == 1  0 == 2
1 == 2  1 == 3
2 == 3  2 == 4
3 == 4  3 == 7
4 == 5  4 == 9

[2, 3, 4, 7, 9] input array
[1, 5, 6, 8, 10] output array
 */