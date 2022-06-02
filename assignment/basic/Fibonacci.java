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

0 1 2 3 4 5 6
0 1 1 2 3 5 8

why return a ?
i : 0           i : 1   i = 2   i = 3
a = 0 (0 : 0)   a = 1   a = 1   a = 2
b = 1           b = 1   b = 2
c = 1           c = 2   c = 3
 */