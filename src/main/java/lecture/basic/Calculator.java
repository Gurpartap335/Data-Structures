package lecture.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a operator : + , - , / , * , % ");
        char c = s.next().charAt(0);

        System.out.println("Enter first number : ");
        int n1 = s.nextInt();

        System.out.println("Enter second number : ");
        int n2 = s.nextInt();

        switch (c) {
            case '+' :
                System.out.println(n1 + n2);
                break;

            case '-':
                System.out.println(n1 - n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Wrong input");


        }

    }
}
