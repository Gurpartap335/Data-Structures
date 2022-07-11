package assignment.basic;

import java.util.Arrays;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Grading System
        System.out.println("Enter number of subjects : ");
        int n = s.nextInt();
        // we can use array for this
        int[] arr = new int[n];

        System.out.println("Enter marks for each subject : ");
        int i = 0;
        do {
            arr[i] = s.nextInt();
            if (arr[i] > 100) {
                System.out.println("Subjects marks cannot be more than 100 \nEnter again");
                continue;
            } else if (-1 > arr[i]) {
                System.out.println("Subjects marks cannot be less than 0 \nEnter again");
            }
            i++;
        } while (i < n);

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
        }

        System.out.println("Total marks : " + sum + " out of " + (n * 100));

        float d = n * 100;
        float per = ((sum / d) * 100);
        System.out.println("Percentage : " + per + "%");

        System.out.println("\n============================================");
        System.out.println("Do you want to view input in Grades : ");
        System.out.println("Enter y for yes\nn for No");

        char c = s.next().charAt(0);

        if (c == 'y') {
            if (per >= 90) {
                System.out.println("+A");
            } else if (per >= 80) {
                System.out.println("A");
            } else if (per >= 70) {
                System.out.println("B");
            } else if (per >= 60) {
                System.out.println("C");
            } else if (per >= 50) {
                System.out.println("D");
            } else if (per >= 40) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("");
        }
    }
}
