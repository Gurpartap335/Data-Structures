/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
package leetcode.array;

import java.util.*;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {

    }

    // brute force approach checking for every element using nested for loop.
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0;j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    // map
    static int[] smallerNumbersThanCurrent2 (int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            // Put the values from copy array(which also sorted) in map. Map does not allow duplicate keys.
            // put method override the value so use putIfAbsent method.
            map.putIfAbsent(copy[i], i); // store how many elements are smaller than it at position value.
        }
        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            //
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }

}

