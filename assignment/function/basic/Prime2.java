package assignment.function.basic;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        // check if number is prime or not
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = primeOrNot(n);
        System.out.println(ans);
    }

    static boolean primeOrNot(int num) {
        // if number has more than two factors than it is not a prime number .

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
