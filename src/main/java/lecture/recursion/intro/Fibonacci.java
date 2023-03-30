package lecture.recursion.intro;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    // recursive
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        // not tail recursion
        // extra step of addition then returning is not tail recursion
        return fibo(n-1) + fibo(n-2);
    }

    // iterative
    static int fiboI(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int temp = 0;
        while (n > 1) {
            temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        return b; // also can return temp
    }
}

// 0 1 1 2 3 5 8 13
// 0 1 2 3 4 5 6 7
// 1. try to see if you can divide problem into sub-problems.
// F(n) = F(n - 1) + F(n - 2) recurrence relation
// 2. The base condition is represented by answers we already know.