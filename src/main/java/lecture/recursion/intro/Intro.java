package lecture.recursion.intro;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        print1(1);

//        int test = 4;
//        printFun(test);

    }

    static void printFun(int test) {
        if (test < 1) { // base condition function will stop when test becomes less than 1.
            return;
        } else {
            // this is called tail recursion
            // this is the last function call.
            printFun(test - 1);
        }
    }


    // print1 is waiting for in call stack bcz it call other function print2,
    // so it's waiting for print2 function to finish.
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

    static void print5(int n) {
        System.out.println(n);
    }


}

/**
Why recursion?
It helps us in solving bigger/complex problems in a simple way.
you can convert recursion solution into iteration(loops) and vice versa.
Space complexity is not constant because of recursive calls.

Visualizing recursion using Recursion tree

when you write recursion in formula it is called
Recurrence relation
Ex: fibo(n) = fibo(n - 1) + fibo(n - 2)

tail recursion

Recursion uses more memory, because the recursive function adds to the stack with
each recursive call, keeps the values there until the call is finished.
LIFO Last In Fast Out.

Base Condition:
Condition where our recursion will stop making new calls.
 The base condition is represented by answers we already know

1. identify if you can break down the problem into smaller problems.
2. Write the recurrence relation if needed
3. Draw the recursive tree
4. About the tree
- See the flow of functions how they are getting in stack
- Identify and focus on left tree calls and right tree calls
Draw the tree and pointer again and again
Use a debugger

 5 See how the values and what type of values(int string) are returned at each step.
 see where the function call with come out. In the end, you will come put of the
 main function.


 Repeated function call happening in recursion Dynamic programming.

 Do not overthink
 */
