/*
Write a function that returns all prime numbers between two given numbers.
 */
package assignment.function.question;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        allPrime(s,e);
    }

    static void allPrime(int s, int e) {
        for (int i = s; i <= e; i++) {
            // 0 and 1 are not prime or composite
            if (i ==1 || i == 0) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j < i; j++) { // 2 < 2
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }

}
