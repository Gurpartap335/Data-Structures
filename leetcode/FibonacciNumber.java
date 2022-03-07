package leetcode;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 0  1  1  2  3  5  8  13  21  34
        // 0  1  2  3  4  5  6  8   9   10
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
