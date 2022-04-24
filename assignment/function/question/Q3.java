/*
A person is eligible to vote if his/her age is greater than or equal to 18 .
Define a method to find out if he/she is eligible to vote .
 */
package assignment.function.question;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(vote());
        System.out.println(vote());
        System.out.println(vote());
    }

    static boolean vote() {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
