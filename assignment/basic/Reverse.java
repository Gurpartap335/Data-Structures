package assignment.basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        reverse();
        reverse();
    }
    static void reverse() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = 0;
        while (n > 0) {
            int last_digit = n % 10;
            ans = ans * 10 + last_digit;
            n /= 10;
        }
        System.out.println(ans);
    }
}
