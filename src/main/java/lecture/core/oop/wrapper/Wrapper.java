package lecture.core.oop.wrapper;

import java.util.ArrayList;

/**
 * Wrapper class is a class whose object wraps primitive data types.
 *
 * Need:
 * They convert primitive data types into objects. Objects are needed if we wish
 * to modify the arguments passed into a method.(bcz primitive types are passed by
 * value.
 * java.util package + data structures
 *
 */
public class Wrapper {
    public static void main(String[] args) {
//        Integer i = 34;
//        System.out.println(i);
//        int a = 34;
//        System.out.println(a);
//        System.out.println(i.equals(a));
//        System.out.println(i.byteValue());
//        System.out.println(i.compareTo(a));
//        Integer i2 = 45;
//        System.out.println(i.compareTo(i2));
//        System.out.println(i2.compareTo(i));








    }
}


class AutoBoxing {
    public static void main(String[] args) {
        char ch = 'a';
        Character c = ch; // primitive to object

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34); // autoboxing because ArrayList only stores objects
        System.out.println(arr.get(0));


        // unboxing
        Character a = 345;
        char c2 = a;

        int num = arr.get(0); // Object to integer
        System.out.println(num);


    }
}