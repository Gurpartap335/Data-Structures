/*
Write a program to print the sum of two numbers enter by user by defining your own method.
 */
package assignment.question;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = s.nextInt();
        System.out.println("Enter second number : ");
        int b = s.nextInt();

        System.out.println(sum(a,b));
        int ans = sum(a,b);
        System.out.println(ans);

        sum(); //void
        product();

    }

    static int sum(int a , int b) {
        return a + b;
    }

    static void sum () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = s.nextInt();
        System.out.println("Enter second number : ");
        int b = s.nextInt();

        System.out.println("Sum of two numbers : " + a + b);
    }

    static void product () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = s.nextInt();
        System.out.println("Enter second number : ");
        int b = s.nextInt();

        System.out.println(a * b);
    }
}
