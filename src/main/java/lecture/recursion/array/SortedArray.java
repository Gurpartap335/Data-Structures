package lecture.recursion.array;

// Find if array is sorted or not

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(arraySortedR(arr, 0));
        System.out.println(arraySortedR(new int[]{1, 2, 3, 4, 5, 6}, 0));
    }

    // iterative
    static boolean arraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // pass by reference and pass by value
    // index will start from 0
    static boolean arraySortedR(int[] arr, int index) {
        // base condition & stopping array getting out of bound
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && arraySortedR(arr, index + 1);
    }

}
















// Java is Pass by value, Not Pass By reference.
// try by yourself.
// stackoverflow

class Test {

    static int a = 10;

    public static void main(String[] args) {
        int x = 5;
        changeValuePrimitive(x);
        System.out.println(x);

        int a = 23;
        System.out.println(changeValuePrimitive2(a));
        System.out.println(a);

//        System.out.println();
//        System.out.println();
//
//        String name = "Gurpartap Singh";
//        String ans = changeValueOfReferenceOrObject(name);
//        System.out.println(name);
//        System.out.println("ans " + ans);
//        System.out.println(name);
//
//        String naam = "Guri";
//        changeValueOfReferenceOrObject2(naam);
//        System.out.println(naam);

//        int[] arr = new int[5];
//        arr = new int[]{1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(arr));
//        changeArrayValue(arr);
//        System.out.println(Arrays.toString(arr));




    }

    public static void changeValuePrimitive(int x) {
        System.out.println(x);
        x = 10;
        System.out.println(x);
    }

    public static int changeValuePrimitive2(int x) {
        x = 10;
        return x;
    }

    public static String changeValueOfReferenceOrObject(String n) {
        n = "Mera na";
        return n;
    }

    public static void changeValueOfReferenceOrObject2(String n) {
        n = "Mera na";
        System.out.println(n);
    }



    // checking for array

    // we are passing reference to the array in this argument
    public static void changeArrayValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

/**
 * Arrays are reference types in Java.
 */