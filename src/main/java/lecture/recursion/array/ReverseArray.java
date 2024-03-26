package lecture.recursion.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(arr, s + 1, e - 1);
    }

    public static void reverseI(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }

}
// draw recursive tree