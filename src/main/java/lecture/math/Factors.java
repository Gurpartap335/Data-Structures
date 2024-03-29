package lecture.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factors2(n);
    }

    // TC : O(n)
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n) {

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }

    }

    // Both time and space O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
