package lecture.basic;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // WAP to print all the factors of a number other than 1 and number itself .
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
