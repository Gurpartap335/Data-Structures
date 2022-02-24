package lecture.basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        while (n > 0) {
            int last = n % 10;
            ans = ans * 10 + last;
            n /= 10;
        }
        System.out.println(ans);

//        int temp = n , revNum = 0;
//        while (temp > 0) {
//            int lastDigit = temp % 10;
//            temp = temp / 10;
//            revNum = revNum * 10 + lastDigit;
//        }
//
//        System.out.println(revNum);

    }
}
