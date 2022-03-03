package lecture.Function;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greet();
        String ans = greet2();
        System.out.println(ans);
    }

    static void greet() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Hello , " + name);
    }

    // return value
    static String greet2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = s.nextLine();
        return "Hello , " + name;
    }
}
