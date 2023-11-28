/*
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
package leetcode.string;

import java.util.Arrays;
import java.util.Scanner;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {

    }

    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0;i < operations.length;i++) {
            if(operations[i].charAt(1) == '+') // i(0,1) index string character at 1 not 0 and 2 -> ++X X++ .
                x++;
            else
                x--;
        }
        return x;
    }

    static int finalValueAfterOperations2(String[] operations) {
        int x = 0;

        for (String a: operations) { // foreach s in operations
            if(a.equals("X++") || a.equals("++X"))
                x++;
            else x--;
        }
        return x;

    }
}
