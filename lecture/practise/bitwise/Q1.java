package lecture.practise.bitwise;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // odd or even
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if ((n & 1) == 1){
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

    }
}
