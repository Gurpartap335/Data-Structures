package lecture.recursion.intro;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factTR(4));
    }

    // recursive
    // not tail recursion
    // extra steps + inefficient uses extra memory.
    public static int fact(int n){
        if (n < 2){
            return 1;
        }
        return n * fact(n - 1);
    }

    // tail recursive
    public static int factTR(int n) {
        return factTR(n, 1);
    }
    public static int factTR(int n, int a) {
        if (n < 2) {
            return a;
        }
        return factTR(n - 1, n * a);
    }

    // iteration
    public static int fact2(int n) {
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

}
/**
 * 1. yes
 * 2. F(n) = n * (n - 1) * (n - 2) * (n - 3) * (n * 4)
 * Base case not multiply it with 0.
 */