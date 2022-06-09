package lecture.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            // correct stores the correct index of arr[i]  store the correct index of the element.
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { // if arr[element] = arr[element - 1] then i++;
                swap(arr,i,correct);
            }
            else i++;
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
/*
When given nos. from range 1 to N use cyclic sort.
Given that numbers are from 1 to N

index = value - 1

Worst Case : (N - 1) + N = O(n)
 */
