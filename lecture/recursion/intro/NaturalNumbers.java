package lecture.recursion.intro;

public class NaturalNumbers {
    public static void main(String[] args) {
//        System.out.println(sumOfNaturalNumbersIteration(10));
//        System.out.println(sumOfNaturalNumbersIteration(20));

        System.out.println(sumOfNaturalNumbersRecursion(5));

//        System.out.println(sumOfNaturalNumbersIteration(10));
//        System.out.println(sumOfNaturalNumbersRecursion(10));
//        System.out.println(sumOfNaturalNumbersRecursion(20));
    }

    // method to print sum of first n natural numbers.
    static int sumOfNaturalNumbersIteration(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // recursive adding.
    // recursive function (function which call itself)
    static int sumOfNaturalNumbersRecursion(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfNaturalNumbersRecursion(n - 1);
    }

}
