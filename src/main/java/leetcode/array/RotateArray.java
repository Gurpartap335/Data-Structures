package leetcode.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

    }

    // we do k %= arr.length do reduce rotate times. k can be larger than array
    // TC: O(n^2) SC: O(1)
    public static void rotateArray(int[] arr, int k) {
        k %= arr.length;

        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }


    // TC: O(n), SC: O(n)
    public static void rotateArray2(int[] nums, int k) {
        k %=  nums.length;

        int[] temp = nums.clone();
        int length = nums.length;

        int i = 0, j = length - k;
        while (j < length) {
            nums[i++] = temp[j++];
        }
        j = 0;
        while (i < length) {
            nums[i++] = temp[j++];
        }
    }


    // TC: O(n) SC: O(n)
    public static void rotateArray3(int[] arr, int k) {
        k %=  arr.length;

        int[] temp = arr.clone();

        for (int i = 0; i < arr.length; i++) {
            arr[(i + k) % arr.length] = temp[i];
        }
    }

    // O(n), O(1)
    public static void rotateArray4(int[] arr, int k) {
        k %=  arr.length;
        int start = 0;
        int end = arr.length - 1;

        reverse(arr, start, end);
        reverse(arr, 0, k - 1);
        reverse(arr, k, end);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

}
// neet
// Left rotated <---
// right rotated --->
// extra space used by algorithm and for the algorithm are different