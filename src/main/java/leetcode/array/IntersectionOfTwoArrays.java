package leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] arr = new int[set2.size()];
        int a = 0;
        for (int e : set2) {
            arr[a++] = e;
        }
        return arr;
    }


    public int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] arr = new int[set.size()];
        int a = 0;
        for (int e : set) {
            arr[a++] = e;
        }
        return arr;
    }


}
