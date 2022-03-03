package lecture.Function;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//
//        System.out.println(a + " " + b);
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);

        int a = 20;
        int b = 30;
        System.out.println(a + " " + b);
        swap(a,b);
        System.out.println(a + " " + b);

    }

    static void swap(int n1 , int n2) { // how values are being passed .
        int temp = n1;
        n1 = n2;
        n2 = temp; // creating new object ?
    }

    /*
    Internal working of swapping program

    In java there is only pass by value
    no pass by reference

    1. primitives : int , short , char , byte ..
    just passing value

    2 object & stuff passing value of the reference variable .

     */

    // Is java is "pass by reference" or pass by value
    /*
    java is always pass by value . unfortunately , when we deal with objects
    we are really dealing with object-handles called references which are passed-by-value as well .
    this terminology and semantics easily confuse many beginners .

    Pass by value and pass by reference is two ways by which we can pass a value to the variable in function .

    Pass by value :
    Pass by reference : it is a process in which the actual copy of reference is passed to the function .


     */


    // what are objects in java ?
    /*
    An object in Java is the physical as well as a logical entity .
     */
}
