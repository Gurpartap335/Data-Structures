package lecture.recursion.level1;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }

    static int ans = 0;
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        reverse1(n / 10);
    }


    //
    static int reverse2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }

    // iteration
    static int reverseI(int n) {
        int ans = 0, lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            ans = ans * 10 + lastDigit;
            n /= 10;
        }
        return ans;
    }

    public static int reverse(int n, int a) {
        if (n == 0) {
            return a;
        }

        return reverse(n / 10 , (a * 10) + n % 10);
    }
    //  recurrence relation
}
