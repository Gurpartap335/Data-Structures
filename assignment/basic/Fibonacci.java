/*
https://leetcode.com/problems/fibonacci-number/
 */
package assignment.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = s.nextInt();

        System.out.println(fib(n));
    }

    static int fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

}
/*
Each number is the sum of the two preceding number ones starting from 0 and 1.
0 1 1 2
0 1 2 3
 */