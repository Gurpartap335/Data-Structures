package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class validMountainArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        while (true) {
            System.out.println("Enter array size : ");
            int size = s.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter element : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            System.out.println(Arrays.toString(arr));
            System.out.println(validMountain(arr));
        }
    }

    static boolean validMountain(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int s = 0;
        int e = arr.length - 1;

        while (s  + 1 < arr.length - 1 && arr[s] < arr[s + 1]) { //
            s++;
        }

        while (e - 1 > 0 && arr[e] < arr[e - 1] ) {
            e--;
        }
        return s == e;
    }

}
