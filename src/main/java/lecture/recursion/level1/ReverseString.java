package lecture.recursion.level1;

// https://leetcode.com/problems/reverse-string/

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Gurpartap"));

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

    static String reverse(String str) {
        char[] arr = str.toCharArray();
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return Arrays.toString(arr);
    }

}
