package lecture.basic;

import java.util.Scanner;

public class KeepTakingNumberUntilX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n , sum = 0;
        System.out.println("Enter number or x to exit from program : ");
        while (s.hasNextInt()) {
            n = s.nextInt();
            sum += n;
        }
        System.out.println(sum);


    }
}
/*
keep taking numbers as inputs till the user enter x
after that print sum of all.
 */