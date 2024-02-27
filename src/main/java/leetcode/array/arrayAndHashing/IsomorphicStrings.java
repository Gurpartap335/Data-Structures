package leetcode.array.arrayAndHashing;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(checkIsomorphic("egg", "add"));
    }

    // solve using hashmap also

    public static boolean checkIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < 256; i++) {
            map1[i] = map2[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            map1[s.charAt(i)] = i;
            map2[t.charAt(i)] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

}
