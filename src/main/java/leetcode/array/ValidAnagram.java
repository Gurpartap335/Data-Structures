package leetcode.array;

//https://leetcode.com/problems/valid-anagram/

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ratom";
        String t = "catkq";
//        System.out.println(isAnagram(s,t));
//        System.out.println(isAnagramSort(s, t));


    }


    static boolean isAnagram(String s, String t) {
        // if length is not similar then no need to check further.
        if (s.length() != t.length()) {
            return false;
        }

        // creating a array(container) for storing which letter appears in the string.
        int[] count = new int[26];
        for (int i = 0; i < s.length();i++) {
            count[s.charAt(i) - 'a']++; // s.charAt(i) - 'a' give us index. +1 when letter appears in given string s.
            count[t.charAt(i) - 'a']--; // -1 when letter appears in target string t.
        }

        // if word is anagram then every element in the array is 0.
        for (int i:count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    // using sorting
    static boolean isAnagramSort(String s, String t) {
        if (s.length() == t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        System.out.println(sChar);
        System.out.println(tChar);

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        System.out.println(sChar);
        System.out.println(tChar);

        return Arrays.equals(sChar, tChar);
    }



}
