package leetcode.array.arrayAndHashing;

import java.util.Collections;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(majorityElement2(new int[]{2, 2, 1, 1, 3, 3, 3, 3, 3, 3, 1}));
    }


    // O(n), O(n)
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int m = Collections.max(map.values());

        for (int k : map.keySet()) {
            if (map.get(k) == m) {
                return k;
            }
        }
        return -1;
    }

    // Boyer-Moore voting algorithm
    public static int majorityElement2(int[] nums) {

        int maj = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
                count++;
            } else if (maj == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}

/*
HashMap extends abstract class AbstractMap implements Map interface.
 */