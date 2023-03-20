package leetcode.recursion;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();

        int ans = digitSum(n1);
        System.out.println(ans);
    }

    static int digitSum(int n){
        if (n == 0){
            return n;
        }
        return (n % 10 + digitSum(n / 10));
    }
}
