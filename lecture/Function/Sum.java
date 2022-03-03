package lecture.Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        sum(); // anything you want to use in static has also to be static .

    }

    static void sum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = s.nextInt();
        System.out.println("Enter second number : ");
        int n2 = s.nextInt();

        System.out.println("Sum = " + (n1 + n2));
    }
    /*
     return_type name () {
          // body
          return statement;
     }
    */
}
