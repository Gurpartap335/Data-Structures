package lecture.recursion.intro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(factTR(4,1));
    }

    // recursive
    // not tail recursion
    // extra steps
    // inefficient uses extra memory.
    static int fact(int n){
        if (n < 2){
            return 1;
        }
        return n * fact(n - 1);
    }

    // iteration
    static int fact2(int n) {
        if (n < 2) { // 0! = 1, 1! = 1
            return 1;
        }
        int ans = 1;
        while (n > 1) {
            ans *= n;
            n--;
        }
        return ans;
    }

    // A tail recursive function to calculate factorial
    static int factTR(int n, int a) {
        if (n <= 0) {
            return a;
        }
        return factTR(n - 1, n * a);
    }

}
/**
 * 1. yes
 * 2. F(n) = n * (n - 1) * (n - 2) * (n - 3) * (n * 4)
 * Base case not multiply it with 0.
 */