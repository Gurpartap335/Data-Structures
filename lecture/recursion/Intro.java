package lecture.recursion;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        print1(1);

        int test = 3;
        printFun(test);

    }

    static void printFun(int test){
        if (test < 1){ // base condition function will stop when test becomes less than 1.
            return;
        }
        else {
            System.out.println(test);
            printFun(test - 1);
            System.out.println(test);
            return;
        }
    }



    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
    }


}

/*
 while the function is not finished executing it will remain in stack.

when a function finishing executing it is removed from stack and the flow of
program is restored to where that function is called.

break down it in smaller problems.

 */
