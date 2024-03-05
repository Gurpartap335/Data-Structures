package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// duplicate elements are allowed
public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 3, 4, 5}, new int[]{2, 2, 3, 4, 5, 6})));
    }


    // TC: O(n + m)
    // SC: O(n + m). O(m) for returning
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums1) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int e : nums2) {
            if (map.containsKey(e) && map.get(e) > 0) {
                list.add(e);
                map.put(e, map.get(e) - 1);
            }
        }

        int[] arr = new int[list.size()];
        int a = 0;
        for (int e : list) {
            arr[a++] = e;
        }
        return arr;
    }

    // Follow Up
    // What if the given array is already sorted.

    // O(max(n, m)), O(n) for algorithm , O(n) for returning
    public static int[] intersectII(int[] nums1, int[] nums2) {

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] arr = new int[list.size()];
        int a = 0;
        for (int e : list) {
            arr[a++] = e;
        }
        return arr;
    }



}
