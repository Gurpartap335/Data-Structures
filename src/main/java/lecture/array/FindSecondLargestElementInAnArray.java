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
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter size of array : ");
//        int size = in.nextInt();
//        int[] arr1 = new int[size];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr1));

//        System.out.println(secondLargest(arr1));


        // difference between Integer array and primitive int array.
        Integer[] a = {
                12, 35, 1, 10, 34, 1
        };

        int[] a2 = {
                12, 35, 1, 10, 34, 1
        };


        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());

        // converting primitives to their respective objects. Integer -> int
        Integer[] arr = new Integer[3];

//        arr[0] = 3443;
////        arr[1] = 343;
////        arr[2] = 3432;
//
//        System.out.println(Arrays.toString(arr));
//
//        Integer[] b = {
//                1, 2, 4, 34
//        };
//        System.out.println(Arrays.toString(b));

        int[] arr2 = new int[3];
        arr2[0] = 2343;
        arr2[2] = 343;
        System.out.println(Arrays.toString(arr2));


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
