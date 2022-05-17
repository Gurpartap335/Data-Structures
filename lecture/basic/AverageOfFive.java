package lecture.basic;

import java.util.Scanner;

public class AverageOfFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        int avg = (a + b + c + d + e)/5;
        System.out.println(avg);
    }
}
