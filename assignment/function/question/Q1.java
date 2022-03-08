package assignment.function.question;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number respectively
        // among three numbers entered by the user.

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int ans1 = max(a,b,c);
        int ans2 = min(a,b,c);
        System.out.println(ans1);

        System.out.println(ans2);
    }

    static int max(int n1 , int n2 , int n3) {
        // max method .
        if (n1 > n2 && n1 > n3) {
            return n1;
        }
        else if(n2 > n3) {
            return n2;
        }
        else
            return n3;
    }

    static int min(int n1 , int n2 , int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        }
        else if(n2 < n3) {
            return n2;
        }
        else
            return n3;
    }
}
