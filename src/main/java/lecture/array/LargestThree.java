package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr1));

        largestThree(arr1);

    }

    public static void largestThree(int[] a){
        sorting(a);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }

    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j-1]) { // 1 0
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
