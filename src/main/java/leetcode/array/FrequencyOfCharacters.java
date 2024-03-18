package leetcode.array;

import java.util.HashMap;

// https://takeuforward.org/data-structure/calculate-frequency-of-characters-in-a-string/

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String s = "carticarticarti";
        frequency(s);
        System.out.println();
        frequency2(s);
        System.out.println();
        frequency2("articles");

    }


    // TC and SC : O(n)
    public static void frequency(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            System.out.print(c + "" + map.get(c) + " ");
        }
    }

    // String character range is Lowercase letters
    // TC : O(n) SC : O(1)
    public static void frequency2(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char) (i + 'a') + "" + freq[i] + " ");
            }
        }
    }

}
