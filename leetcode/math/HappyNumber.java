package leetcode.math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
//        System.out.println(isNumberHappy(19));
//        System.out.println(isNumberHappy(4));
        System.out.println(isNumberHappy(2));
//        System.out.println(isNumberHappy(3));
//        System.out.println(isNumberHappy(5));
    }

    // Floyd's cycle-finding algorithm
    static boolean isNumberHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if (slow == 1) return true;
        } while (slow != fast);
        return false;
    }

    static int squareSum(int n) {
        int sum = 0, count = 0;
        while (n > 0) {
            count = n % 10;
            sum += (count * count);
            n /= 10;
        }
        return sum;
    }

    // HashSet also can use recursion.
    static boolean isNumberHappy2(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum, remain;
        while (inLoop.add(n)) {
            squareSum = squareSum(n);
            if (squareSum == 1) {
                return true;
            } else {
                n = squareSum;
            }
        }
        return false;
    }
}
/**
 * A happy number:
 *  - starting with any positive integer, replace the number by the sum of the
 *  squares of its digits.
 *  - Repeat the process until the number equals 1 or it loops endlessly in a
 *  cycle which does not include 1.
 *  - Those numbers for which this process ends in 1 are happy.
 */
