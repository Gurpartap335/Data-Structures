package assignment.function.basic;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // write a program to find factors of a number .
        factors2();
        factors2();
    }
    static void factors() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }

    static void factors2() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
