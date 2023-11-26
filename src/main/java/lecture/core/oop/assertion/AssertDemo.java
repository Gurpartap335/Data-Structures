package lecture.core.oop.assertion;

import java.util.Scanner;

public class AssertDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s.nextInt();

        assert age > 18;
//        assert age > 18:"User is not Valid";

        System.out.println("User is valid");
    }
}
// -ea or -enableassertions
