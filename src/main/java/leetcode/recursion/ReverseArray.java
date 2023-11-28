package leetcode.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){

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
