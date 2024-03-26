package lecture.recursion.basic;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbersIteration(-10));
        System.out.println(sumOfNaturalNumbersRecursion(-10));
        System.out.println(sumOfNaturalNumbersIteration(0));
        System.out.println(sumOfNaturalNumbersRecursion(0));
        System.out.println(sumOfNaturalNumbersIteration(1));
        System.out.println(sumOfNaturalNumbersRecursion(1));
        System.out.println(sumOfNaturalNumbersIteration(10));
        System.out.println(sumOfNaturalNumbersRecursion(10));
        System.out.println(sumOfNaturalNumbersIteration(20));
        System.out.println(sumOfNaturalNumbersRecursion(20));
    }

    static int sumOfNaturalNumbersIteration(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    static int sumOfNaturalNumbersRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return n + sumOfNaturalNumbersRecursion(n - 1);
    }

    // tail recursion

    public static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sum(n - 1, sum + n);
    }
}
