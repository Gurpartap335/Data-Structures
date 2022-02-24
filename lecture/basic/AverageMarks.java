package lecture.basic;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your character : ");
        char grade = scan.next().charAt(0);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        System.out.println(grade);
        System.out.println((n1 + n2 + n3) /3);
//
        System.out.println("Enter your name : ");
        String name = scan.next();
        System.out.println(name);
    }
}
