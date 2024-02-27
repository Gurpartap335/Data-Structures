package leetcode.array.arrayAndHashing;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
//        String[] str = {"flower", "flow", "flight"};
        String[] str = {"dog", "racecar", "acar"};
        System.out.println(longestCommonPrefix(str));

    }

    // tc : O(nlog*n + m)
    // sc : O(1)
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];

        int i = 0;
        while (i < s1.length() && i < s2.length()) { // i < s2.length() in the while loop is not strictly necessary,
            if (s1.charAt(i) == s2.charAt(i)) { // it can make the algorithm slightly more efficient in some cases.
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }

}

// Strings are ordered based on their alphabetical order(lexicographical).
// based on the int value of the chars that form them.
