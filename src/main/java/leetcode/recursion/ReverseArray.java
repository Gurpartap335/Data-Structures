package leetcode.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int si = in.nextInt();
        int[] arr = new int[si];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        reverseArray(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    // reverse array using recursion
    static void reverseArray(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,++start,--end);
    }
}
