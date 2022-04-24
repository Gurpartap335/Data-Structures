package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr,start,end);
                start++;
                end--;
        }
    }

    static void swap(int[] a,int s , int e) {
        int t = a[s];
        a[s] = a[e];
        a[e] = t;
    }
}
