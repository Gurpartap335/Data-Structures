/*
WAP a program to return MAX element of Array .
 */
package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr1));

        System.out.println(maxElementOfArray(arr1));


    }

    static int maxElementOfArray(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/*
Edge cases
 */
