package lecture.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int si = in.nextInt();
        int[] arr = new int[si];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target element");
        int t = in.nextInt();
        int s = 0;
        int e = arr.length - 1;
        System.out.println(binary(arr,t,s,e));

    }

    static int binary(int[] arr, int t, int s, int e) {
        if (s > e) return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == t){
            return m;
        }
        if (t < arr[m]){ // if mid element is greater than target element then shift the end.
            return  binary(arr,t,s,m - 1);
        }
        else {
            return binary(arr,t,m + 1,e);
        }
    }
}
