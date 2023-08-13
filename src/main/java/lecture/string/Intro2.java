package lecture.string;

import java.util.Arrays;

public class Intro2 {
    public static void main(String[] args) {
        // In java string is basically an object that represents sequence of char values.
//       char[] ch = {'j','a','v','a'};
//       String n = new String(ch);
//       System.out.println(ch);
//       System.out.println(Arrays.toString(ch) + " " +  n);


        // there are two ways to create string object
        // literal
//        String s = "hello";
//        String s2 = "hello"; // it does not create a new instance.
        /*
        JVM checks string constant pool first.
        Strings object are stored in a special memory area -> string constant pool
         */

//        String s3 = new String("hello"); // create two objects and one reference variable
//
//        String name = "Utopia";
//
//        System.out.println(name);
//        name.concat(" 22");
//        System.out.println(name); // strings are immutable
//        // new object is created
//
//        // explicitly assign it to the reference variable
//        name = name.concat("22");
//        System.out.println(name);
//
//        name = "Donda";
//        System.out.println(name);


        // A part of String is called substring.

//        String s = "computer";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(5));
//        System.out.println(s.substring(2,5));
//        System.out.println(s.substring(4,5));

        String str = "abcd";
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1, 2));
        System.out.println(str.substring(2, 3));
        System.out.println(str.substring(3, 4));

//        System.out.println(str.substring(0, 0));
//        System.out.println(str.substring(1, 1));
//        System.out.println(str.substring(4, 4));

        // left to right
        System.out.println("hello" + 33 + 24);
        System.out.println(23 + 17 + "hello");

        String arr = "abc#def#ghj#klmone";
        System.out.println(Arrays.toString(arr.split("#")));

        System.out.println(34.543 + "hello");
        System.out.println(3443L + "Donda");
        System.out.println("Ye" + true);
        System.out.println("Untitled" + 234343.432343f);

        System.out.println(21 + "abs" + 2);
//        System.out.println((int)(21 + "abs" + 2));

        // NumberFormatException
//        System.out.println(Integer.parseInt(21 + "abs" + 2));
//        System.out.println(Integer.valueOf(21 + "abs" + 2));






    }
}
/*
Object is an instance(copy) of a class.

class is a blueprint or template from which objects are created.

Java String class provides a lot of methods
compare concat equals split length replace compareTo intern substring
 */

// https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java