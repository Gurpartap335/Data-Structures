package neetcode.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagrama"));
    }


    // using sorting
    public static boolean isAnagram(String s, String t) {
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        }

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
        return map1.equals(map2);
    }
}
