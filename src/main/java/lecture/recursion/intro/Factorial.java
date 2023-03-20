package lecture.recursion.intro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact3(9));

    }

    // recursive
    static int fact(int n){
        if (n < 2){
            return 1;
        }
        return n * fact(n - 1);
    }

    // iteration
    static int fact2(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
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

    static int fact3(int n) {
        return factTR(n, 1);
    }
}
