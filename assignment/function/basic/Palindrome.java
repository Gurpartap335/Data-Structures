package assignment.function.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Palindrome : An integer is a palindrome when it reads the same backward .

        boolean ans = palindrome();
        System.out.println(ans);
    }

    static boolean palindrome() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int temp = n;
        int rev = 0;
        int last_night = 0;
        while (n > 0) {
            last_night = n % 10;
            rev = rev * 10 + last_night;
            n /= 10;
        }


        return temp == rev;
//        if (temp == rev) {
//            return true;
//        }
//        else
//            return false;
    }
}
