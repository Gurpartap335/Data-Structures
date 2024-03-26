package lecture.recursion.basic;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int a) {
        if (n == 0) {
            return a;
        }
        if (n % 2 == 0) {
            return helper(n / 2, ++a); // out of two return statement executes only one.
        } else {
            return helper(n - 1, ++a); // a + 1 or a++ not a++ |||| n - 1 better than n -= 1 or n = n - 1??
        }
    }

    public static int numberOfSteps2(int n) {
        if (n == 0) {
            return n;
        }

        return 1 + (n % 2 == 0 ? numberOfSteps2(n / 2) : numberOfSteps2(n - 1));
        // extra step of addition
    }
}
