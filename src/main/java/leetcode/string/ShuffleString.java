package leetcode.string;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(shuffle("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));

    }

    // TC : O(n) SC : O(n)
    static String shuffle(String s,int[] indices) {
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            c[indices[i]] = s.charAt(i); // character at the ith position moves to indices[i] in shuffled string.
        }
        return new String(c);
//        return String.valueOf(c);
//        return String.copyValueOf(c);
    }
}
