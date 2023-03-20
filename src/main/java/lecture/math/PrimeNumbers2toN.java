package lecture.math;

import java.util.Scanner;

// Program for printing prime numbers from 1 to n
public class PrimeNumbers2toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        printNumbersFrom1ToN(n);

    }

    /**
     * Time Complexity is O(sqrt(n)) + O(n)
     */
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) { // i <= Math.sqrt
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printNumbersFrom1ToN(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
