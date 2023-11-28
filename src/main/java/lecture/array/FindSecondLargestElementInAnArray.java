/*
https://www.geeksforgeeks.org/find-second-largest-element-array/
 */
package lecture.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindSecondLargestElementInAnArray {
    public static void main(String[] args) {

    }

    private static int secondLargest(int[] arr1) {

        int max1  = 0 , max2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            max1 = Math.max(arr1[i],max1);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == max1){
                continue;
            }
            max2 = Math.max(arr1[i],max2);
        }

        if (max2 == 0){
            System.out.println("There is no second largest element :");
            return -1;
        }
        else {
            return max2;
        }

        // time complexity O(n^2)
    }
}
/*
return -1 if no element is found.
 */
