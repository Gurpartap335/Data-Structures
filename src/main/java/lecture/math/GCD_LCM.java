package lecture.math;

/**
 * GCD Greatest Common Divisor
 * HCF Highest Common Factor
 */
public class GCD_LCM {
    public static void main(String[] args) {

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

/**
 * 850 and 680
 * HCF is 170(highest or greatest number) can divide both numbers.
 * LCM is 3400 means both numbers 850 and 680 can divide 3400 completely.
 * HCF x LCM = A x B
 * gcd(a,b) = gcd( rem(b, a), a)
 * Large number is replaced by smaller number and smaller number is replaced by
 * difference between that two numbers.
 *
 * Time Complexity: O(log(min(A, B))?
 */

/**
 * The Euclidean Algorithm is a k-step iterative process that ends when the remainder
 * is zero.
 * Why this process produces the largest number that divides nicely into both values.
 * */