package lecture.recursion.intro;

// https://www.enjoyalgorithms.com/blog/find-the-minimum-and-maximum-value-in-an-array

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {3432, 4, 45, 6, 10, 99};
        System.out.println(Arrays.toString(find(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE)));
        System.out.println(Arrays.toString(find(arr, 0, 0, 0)));
    }

    // recursive program to find minimum and maximum elements of array.
    // using in-built function
    static int findMax(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }

        return Math.max(arr[n-1], findMax(arr,n - 1));
    }

    static int findMin(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], findMin(arr,n - 1));
    }


    public static int[] find(int[] arr, int index, int min, int max) {
        if (arr.length == index) {
            return new int[]{min, max};
        }

        // if min value is greater than current array value then update the min value.
        // bcz we need minimum value in the array.
        if (arr[index] < min) {
            min = arr[index];
        }

        // if current array value is greater than max then update the max value
        // bcz we need max value
        if (arr[index] > max) {
            max = arr[index];
        }
        return find(arr, index + 1, min, max);
    }
    // we are using MAX and MIN to prevent edge cases and
    // using this we can replace min and max with first value of the array in first time comparison
    // 4, 45, 6, 10, 99 array minimum value will be 0 but if you pass MAX value then it will be 4

}
