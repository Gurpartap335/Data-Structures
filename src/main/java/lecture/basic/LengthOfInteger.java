package lecture.basic;

import java.util.Scanner;

public class LengthOfInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
