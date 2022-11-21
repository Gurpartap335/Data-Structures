package lecture.recursion.level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(product(52354));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n/10);
    }

    // product of digits
    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n/10);
    }
}
