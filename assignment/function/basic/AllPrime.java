package assignment.function.basic;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        // Give an integer , print all the prime numbers that lie in the range 2 to N (both inclusive)
        // 1 is not a prime number and it is not a composite number .
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
