package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.ArrayUtils;


public class FIndFirstAndLastPositionOfElementInSortedArray {
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



        while (true) {
            // corner case
            System.out.println("Enter a target element : ");
            int t = s.nextInt();
            System.out.println(firstPosition(arr,t));
            System.out.println(lastPosition(arr,t));
        }
    }

    // first i am going to find the first position of an element.
    static int firstPosition(int[] arr, int t) {
        // corner case
        if (arr.length == 0) {
            return -1;
        }

        if (arr[0] == t) {
            return 0;
        }
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s)/2;
            if (arr[m] == t) {
                if (arr[m] > arr[m - 1]) {
                    return m;
                } else {
                    e = m - 1;
                }
            }
            else if (t > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return -1;

    }

    // this function gonna return the last position of element
    static int lastPosition(int[] arr, int t) {

        // corner case
        if (arr.length == 0) {
            return -1;
        }

        if (arr[arr.length - 1] == t) {
            return (arr.length - 1);
        }

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s)/2;
            if (arr[m] == t) {
                if (arr[m] < arr[m + 1]) {
                    return m;
                } else {
                    s = m + 1;
                }
            }
            else if (t > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return -1;

    }


}
