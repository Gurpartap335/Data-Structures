package lecture.recursion.level1;

// https://leetcode.com/problems/reverse-string/

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        reverse(c);

    }

    static void reverse(char[] c) {
        int s = 0;
        int e = c.length - 1;
        helper(c, s, e);
        System.out.println(Arrays.toString(c));
    }

    static void helper(char[] c, int s, int e) {
        if (s >= e) {
            return;
        }
        char temp = c[s];
        c[s] = c[e];
        c[e] = temp;
        helper(c, ++s, --e);
    }
}
