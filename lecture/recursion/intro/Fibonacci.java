package lecture.recursion.intro;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    // recursive
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        // not tail recursion
        return fibo(n-1) + fibo(n-2);
    }

    // iteration
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

// 0 0 1 1 2 3 5 8
// 0 1 2 3 4 5 6 7