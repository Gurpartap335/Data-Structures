package leetcode.math;

// https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
        System.out.println(sumOfDivisors(5));
    }

    // gives TLE error TC O(n^2)
    static int sumOfDivisors(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += factors(i);
        }
        return ans;
    }

    static int factors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // TC O(n)
    static long sumOfDivisors2(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (n/i) * i;
        }
        return sum;
    }
}
