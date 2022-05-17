package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr.length + " " + arr2.length);


//        System.out.println(minElement(arr));
//
//        System.out.println(maxElement(arr));

//        System.out.println(sumOfAllElementOfArray(arr));
//
//        System.out.println(Arrays.toString(reverseArray(arr)));



    }

    // return the minimum element from array .
//    static int minElement(int[] arr) {
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        return min;
//    }
//
//    // return the maximum element from array
//    static int maxElement(int[] arr) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        return max;
//    }
//
//    // return the sum of all element of array
//    static int sumOfAllElementOfArray(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        return sum;
//    }
//
//    // reverse array
//    static int[] reverseArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//
//        return arr;
//    }
//
//    static void swap(int[] a , int s , int e) {
//        int t = a[s];
//        a[s] = a[e];
//        a[e] = t;
//    }



}
