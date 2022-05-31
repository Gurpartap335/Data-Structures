/*
Write a program that will ask the user to enter his/her marks(out of 100).
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-10         O
81-90        +A
71-80         A
61-70         B
51-60         C
41-50         D
<= 40         E(Fail)
 */
package assignment.question;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        grade();

    }

    static void grade() {
        Scanner s = new Scanner(System.in);

        float totalMarks = 0 , percentage, average;
        System.out.println("Enter number of subject : ");
        int n = s.nextInt();

        System.out.println("Enter marks of " + n + " Subject");
        for (int i = 0; i < n; i++) {
            int mark = s.nextInt();
            if (mark > 100) {
                System.out.println("Each subject is of 100 marks + Invalid input");
                System.out.println("Enter again");
                mark = s.nextInt();
            }
            totalMarks += mark;
        }

        System.out.println("Total marks : " + totalMarks);
        percentage = (totalMarks / (n * 100)) * 100;

        switch ((int)percentage/10) {
            case 9:
                System.out.println("O");
                break;
            case 8:
                System.out.println("+A");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            default:
                System.out.println("failed lil bro");
                break;
        }


    }
}
