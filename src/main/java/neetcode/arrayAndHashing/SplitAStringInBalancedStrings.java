package neetcode.arrayAndHashing;

import java.util.Arrays;

// https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLRRRRLLL"));
    }

    /**
     * TC : O(n) and SC : O(1)
     * @param s balanced string
     * @return number of substrings which are balanced
     */
    public static int balancedStringSplit(String s) {
        int count = 0, i = 0, j = 0;

        while (j < s.length()) {
            if (s.charAt(j) == 'R') {
                i++;
            } else {
                i--;
            }
            if (i == 0) {
                count++;
            }
            j++;
        }
        return count;
    }
}
