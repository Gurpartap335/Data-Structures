package assignment.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // write a method for finding a factorial of a number .
        factorial();
        
    }
    
    static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        System.out.println(ans);
    }

}
