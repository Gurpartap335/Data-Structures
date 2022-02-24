package lecture.basic;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // sum of even digits and sum of odd digits separately
        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int last = n % 10;
            if(last % 2 == 0)
                evenSum += last;
            else
                oddSum += last;

            n = n / 10;
        }

        System.out.println(evenSum + " " + oddSum);
    }
}
