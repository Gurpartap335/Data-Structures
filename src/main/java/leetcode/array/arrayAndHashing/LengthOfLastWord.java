package leetcode.array.arrayAndHashing;

import java.util.Arrays;

// https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {

    public static void main(String[] args) {
//        System.out.println(length("aaa"));
        System.out.println(length2("    Hello  "));
    }


    // TC: O(n), TC: O(1)
    public static int length(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();

        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' '){
                return count;
            }
            count++;
        }
        return count;
    }


    // recursion
    // TC: O(n) SC: O(n) n : s string
    public static int length2(String s) {
        s = s.trim();
        char[] ch = s.toCharArray();
        return helper(ch, ch.length - 1,0);
    }

    public static int helper(char[] s, int i, int count) {
        if (s[i] == ' ') {
            return count;
        }
        // if sentence contain only one word then we will return count from this condition
        // when we reach the end of the word, so it can not reach the return statement
        // to increase the count.
        if (i <= 0) {
            count++;
            return count;
        }
        return helper(s, i - 1, count + 1);
    }
}
