package leetcode.arrayAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsequence(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    public static int longestConsequence(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, true);
        }

        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }

        int maxLength = 0;
        for (int val : map.keySet()) {
            if (map.get(val)) {
                int curValueLength = 1;
                while (map.containsKey(val + curValueLength)) {
                    curValueLength++;
                }
                maxLength = Math.max(maxLength, curValueLength);
            }
        }
        return maxLength;
    }


    // using Set
    public static int longestConsequence2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        int maxLength = 0;
        for (int val : set) {
            if (!set.contains(val - 1)) { // if set contains value then we canno    t start counting from here
                int curValueLength = 1;
                while (set.contains(val + curValueLength)) {
                    curValueLength++;
                }
                maxLength = Math.max(maxLength, curValueLength);
            }

        }
        return maxLength;
    }
}
