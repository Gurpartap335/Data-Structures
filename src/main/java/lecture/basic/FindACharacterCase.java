package lecture.basic;

import java.util.Scanner;

public class FindACharacterCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter character :");
        char ch = s.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }

    }
}
