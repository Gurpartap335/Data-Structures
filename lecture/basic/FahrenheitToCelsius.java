package lecture.basic;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int gap = s.nextInt();

        for (int i = start ; i <= end; i += gap) {
            int ans = (i - 32)*5;
            int fin = ans/9;
            System.out.println(i + "\t" + fin);
        }
    }
}
