package lecture.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }
}
/*
Insertion sort
- This algorithm is one of the simplest algorithm with simple implementation.
- efficient for small data values.


 */
