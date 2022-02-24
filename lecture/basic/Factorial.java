package lecture.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
