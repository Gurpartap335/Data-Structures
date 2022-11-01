package lecture.math;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Program to check if Given number is Prime or not.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }


    /**
     * TC: O(sqrt(n))
     * method return whether number is prime or not.
     *
     * @param n n value
     * @return true if number is prime else false if not.
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

    /**
     * Prime number Composite number
     * 0 and 1 is neither prime or composite.
     * Unique factorization
     */

    @Test
    public void checkForZero() {
        Assert.assertEquals(false, isPrime(0));
    }

    @Test
    public void checkForOne() {
        Assert.assertEquals(false, isPrime(1));
    }

    @Test
    public void checkForTwo() {
        Assert.assertEquals(true, isPrime(2));
    }

    @Test
    public void checkForFour() {
        Assert.assertEquals(false, isPrime(4));
    }


}

