package lecture.basic.tutorials;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 44 , y = 49 , z = 2;
        int ans = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println(ans);

        int a,b;
        a = 20;
        b = (a > 22) ? 1 : 2; // if a is greater than 22 than b = 1 else b = 2;
        System.out.println(b);
    }
}
/*
Java ternary operator is the only conditional operator that makes three operands .
variable = Condition ? Expression2 : Expression3
The above statement states that if the condition returns true
Expression1 gets executed
else
the Expression2 gets executed and the final result stored in a variable .
 */