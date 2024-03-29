package lecture.string;


import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {



    }
}
/*
A string variable contains a collection of characters surrounded by double quotes.

String    name     =  "guri"
datatype  ref.var     object

Internal working of string.
String Pool  separate memory
immutability

Pretty printing
 */

/*
The java command-line argument is an argument i.e. passed at the time of running the java program.

String[] args
String[] -> simple String array
args -> name of the array it can be anything(a, ar, parameter)

 */


/**
String s1 and s2 will share same address. String's address will be stored in
 stack and string's object will be at heap in intern pool.
 With new Keyword you can create different address of the string but string still
 point to the same character array of string s1.

 Interning is sharing memory by strings, and it's done to optimize memory.
 Implication:
 1. Comparison Don't use == use equals
 2. Immutability
 reference is mutable, instance is not.
 impact ->
 Performance slow
 */

class StringMemory {

    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = new String("hello");
//        System.out.println(s1.equals(s3));
//        System.out.println(s1 == s3);
//
//        String travis = "Utopia";
//        System.out.println(travis);
//        travis = "Astroworld";
//        System.out.println(travis);
//        travis = travis + travis;
//        System.out.println(travis);


        StringBuilder sb = new StringBuilder("Donda");
        sb.insert(2, 'o');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.append(2);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
    }
}



// time difference
class StringBuilderTime {

    public static void main(String[] args) {
        int n = 10000000;

//        String s = "";
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < n; i++) { // this for loop takes O(n^2) time
//            s += i;
//        }
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//        System.out.println(duration); // for string 4928
//        System.out.println(s);

        StringBuilder sb = new StringBuilder(" ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration: " + duration); // for string 4928
//        System.out.println(sb);
    }
}


