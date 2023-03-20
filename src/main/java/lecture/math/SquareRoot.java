package lecture.math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        System.out.println(sqrt(n,p));

    }

    // TC O(log n)
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if (m  * m == n) {
                return m;
            } else if (m * m > n) {
                e = m - 1;
            }  else {
                s = m + 1;
            }
        }
        root = e;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr; // 6.3999999 - 0.1 -> 6.29999999
            incr /= 10; // 0.1 -> 0.01 -> 0.001
        }
        return root;

    }
}
