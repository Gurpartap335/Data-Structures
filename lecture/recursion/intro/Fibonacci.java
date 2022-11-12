package lecture.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // recursion
        int n = s.nextInt();
        System.out.println(fibo(n));

    }

    static int fibo(int n){
        // base condition.
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
// 0 0 1 1 2 3 5 8
// 0 1 2 3 4 5 6 7