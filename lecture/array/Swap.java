package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        System.out.println(Arrays.toString(arr));

//        swap(arr,3,6);
        swap(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] a , int index1 , int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static void swap(int[] array) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index first : ");
        int i1 = s.nextInt();
        System.out.println("Enter index second : ");
        int i2 = s.nextInt();

        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
