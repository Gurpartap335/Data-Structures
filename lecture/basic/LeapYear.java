package lecture.basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year : ");
        int y = s.nextInt();
        if ((y % 400 == 0 || y % 100 != 0) && y % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }
}
