package lecture.basic;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        // keeping taking numbers as inputs till the user enter 'x', after that print sum of all.
        Scanner s = new Scanner(System.in);

//        char c = 'x';
//        System.out.println(c);
//        System.out.println((int)c);

        int n , sum = 0;
        System.out.println("Enter number or x to exit to program");
        while (true){
            n = s.nextInt();
            sum += n;

            if (n == 'x') {
                break;
            }
        }
        System.out.println("Sum " + sum);

    }
}
