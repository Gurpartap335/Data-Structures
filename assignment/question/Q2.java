package assignment.question;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd .

        evenOrOdd();
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean ans = evenOrOdd(num);
        System.out.println(ans);


    }

    static void evenOrOdd(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else
            System.out.println("odd");
    }

    static boolean evenOrOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else
            return false;
    }
}
