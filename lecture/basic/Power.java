package lecture.basic;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = s.nextInt();
        int n = s.nextInt(); // multiply x n times || x = 2 n = 5 >> 2 * 2 * 2 * 2 * 2

        // exponent
        int ans = 1;
        while (n > 0) {
            ans *= x;
            n--;
        }
//        for (int i = 1; i <= n; i++) {
//            ans *= x;
//        }

        System.out.println(ans);
    }
}
