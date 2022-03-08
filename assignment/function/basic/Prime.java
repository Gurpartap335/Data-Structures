package assignment.function.basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // check number is prime or not
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = isPrime(n);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while(c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
