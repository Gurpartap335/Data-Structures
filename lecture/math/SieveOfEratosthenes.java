package lecture.math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] primes = new boolean[n+1];

        sieve(n, primes);
    }

    // TC O(n * log(log n))
    // Auxiliary Space O(n)
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        //printing false value in boolean array after removing multiple of prime no.s
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
/**
 * No need to check for numbers which are divisible by prime numbers which comes
 * under sqrt(n)(n: upto which we have to print prime numbers)
 * or
 * remove all the composite numbers between 1 to n using multiples.
 *
 * O(n * log(log n))
 * Harmonic Progression
 */
