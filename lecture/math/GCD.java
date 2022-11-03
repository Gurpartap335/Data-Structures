package lecture.math;

/**
 * GCD Greatest Common Divisor
 * HCF Highest Common Factor
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(60, 90));
        System.out.println(gcd(9, 27));
        System.out.println(lcm(60,90));
        System.out.println(lcm(5, 10));
        System.out.println(lcm(1, 10));
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
 */