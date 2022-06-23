package leetcode.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
        System.out.println("Enter target element");
        int t = in.nextInt();
        int s = 0;
        int e = arr.length - 1;
        System.out.println(search(arr,t,s,e));
    }

    static int search(int[] arr, int t, int s, int e){
        if (s > e){
            return -1;
        }

        int mid = s + (e - s)/2;
        if (arr[mid] == t){
            return mid;
        }
        else if(arr[mid] > t){
            return search(arr,t,s,mid -1);
        }
        else{
            return search(arr,t,mid + 1,e);
        }
    }
}
