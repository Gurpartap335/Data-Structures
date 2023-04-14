package lecture.recursion.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1234));
        System.out.println(sum(1234000));
        System.out.println(sum(123456789));
    }

    static int sum(int n) {
//        if (n % 10 == n) { // with this condition one less function in stack.
//            return n;
//        }
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n/10);
    }

    static int sum2(int n, int a) {
        if (n == 0) {
            return a;
        }
        return sum2(n / 10, n % 10 + a);
    }

    // product of digits
    static int product(int n) {
//        if (n % 10 == n) { // 4 functions in stack
//            return n;
//        }
        if (n == 0) { // 5 functions in stack
            return 1;
        }
        return (n % 10) * product(n/10);
    }

    static int product2(int n, int a) {
        if (n == 0) {
            return a;
        }
        return product2(n / 10, (n % 10) * a);
    }
}
/**
 * F(n) = n % 10 + F(n / 10);
 * F(n) = F(n / 10, n % 10 + a)
 */
