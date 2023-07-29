package lecture.basic;

import java.util.Arrays;

public class PassByValueOrReference {
}
/**
 *
 * pass by value will copy the value,
 * pass by reference will give the memory location
 * java always passes argument by value, but what you are passing by value is a reference
 * to an object, not a copy of the object.
 */

class Test {

    static int a = 10;

    public static void main(String[] args) {
//        int x = 5;
//        changeValuePrimitive(x);
//        System.out.println(x);
//
//        int a = 23;
//        System.out.println(changeValuePrimitive2(a));
//        System.out.println(a);


        // strings values not changed because strings are immutable.
        String name = "Cash";
        String ans = changeValueOfReferenceOrObject(name);
        System.out.println(ans);
        System.out.println(name);

//        String naam = "Guri";
//        changeValueOfReferenceOrObject2(naam);
//        System.out.println(naam);

        int[] arr = new int[5];
        arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        changeArrayValue(arr);
        System.out.println(Arrays.toString(arr));




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
        n = "Carti";
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