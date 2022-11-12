package lecture.recursion.intro;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact2(9));
        System.out.println(fact2(1));
        System.out.println(fact2(0));
        System.out.println(fact2(-12));
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
}
