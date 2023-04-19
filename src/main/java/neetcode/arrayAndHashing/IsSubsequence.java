package neetcode.arrayAndHashing;

// https://leetcode.com/problems/is-subsequence/description/
public class IsSubsequence {
    public static void main(String[] args) {
//        System.out.println(checkRecursion("abcd", "abtecond"));
        System.out.println(checkRecursion2("abc", "ahbgdc", 0, 0));
    }

    // two pointer
    // time complexity: O(n) n : s + t
    // space complexity: O(1)
    public static boolean check(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();

        int i = 0, j = 0;
        while (j < ts.length) {
            if (cs[i] == ts[j]) {
                i++;
                if (i == cs.length) { // only true if all the characters in s found in t string
                    return true;
                }
            }
            j++;
        }
        return false;
    }

    // Less fast than solution using array
    // every comparison charAt() method is called two times.
    public static boolean check2(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        int i = 0, j = 0;
        while (j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length()) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }

    // using recursion
    // try divide problem into sub-problems
    public static boolean checkRecursion(String s, String t) {
        return solve(s, t, 0, 0);
    }

    public static boolean solve(String s, String t, int i, int j) {
        // if reach the end of s string return true
        if (i == s.length()) {
            return true;
        }
        // if reach the end of t string return false
        if (j == t.length()) { //
            return false;
        }

        if (s.charAt(i) == t.charAt(j)) {
            return solve(s, t, i + 1, j + 1);
        } else {
            return solve(s, t, i, j + 1);
        }
    }


    // no need of helper function
    public static boolean checkRecursion2(String s, String t, int i, int j) {
        if (i == s.length()) {
            return true;
        }
        if (j == t.length()) {
            return false;
        }
        return s.charAt(i) == t.charAt(j) ? solve(s, t, i + 1, j + 1) : solve(s, t, i, j + 1);
    }



}
/**
 * Subsequence: a sequence that appears in the same relative order, but not
 * necessarily contiguous.
 *
 * Substring: a contiguous sequence that appears in the same relative order as
 * the original string.
 */
