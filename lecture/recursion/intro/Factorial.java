package lecture.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int n = s.nextInt();
//        int ans = 1;
//        for (int i = n; i > 0; i--) {
//            ans *= i;
//        }
//        System.out.println(ans);


        // recursion
        // divide problem into subproblem

        int n = s.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n){
        if (n < 2){
            return 1;
        }
        return n * fact(n - 1);
    }
}
