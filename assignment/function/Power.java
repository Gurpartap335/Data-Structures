package assignment.function;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean ans = isArmStrong(n);
        System.out.println(ans);
    }

    static boolean  isArmStrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }
        if (sum == temp) {
            return true;
        }
        else
            return false;
    }
}
