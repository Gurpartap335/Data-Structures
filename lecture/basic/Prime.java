package lecture.basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        // if number has factor other than 1 and 0 its not prime number .

        int a = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                a += 1;
                if (a > 0) {
                    break;
                }
            }
        }
        if (a > 0) {
            System.out.println("Not prime");
        }
        else
            System.out.println("Prime");


    }
}
