package neetcode.arrayAndHashing;

import java.util.*;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagrama"));
    }


    // using sorting
    // TC O(n log(n))
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Arrays.sort(s2);
        Arrays.sort(t2);

        return Arrays.equals(s2,t2);

//        for(int i = 0; i < s.length(); i++) {
//            if (s2[i] != t2[i]) {
//                return false;
//            }
//        }
//        return true;
    }

    // Using HashMap data structure.
    // TC : O(n) SC : O(n) n length of string
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s2.length; i++) {
            map1.put(s2[i], map1.getOrDefault(s2[i], 0) + 1);
            map2.put(t2[i], map2.getOrDefault(t2[i], 0) + 1);
        }
        return map1.equals(map2); //for comparing two maps use equal method not ==
    }
}

// Follow up: What if the inputs contain Unicode characters? How could you adapt
// your solution to such a case?