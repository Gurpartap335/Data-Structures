/*
The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.

Given a positive integer N, return true if and only if it is an Armstrong number.
 */
package assignment.basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        boolean ans = armstrong();
        System.out.println(ans);
    }

    static boolean armstrong() {;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int count = 0;

        while (n > 0) {
            n /= 10;
            count += 1;
        }

        int last ;
        int sum = 1;
        while (temp > 0) {
            last = temp % 10;
            for (int i = 0; i < count; i++) {
                sum = last;
            }
            temp /= 10;
        }

        System.out.println(temp + " " + sum);
        if (sum == temp) {
            return true;
        }
        else
            return false;
    }
}
