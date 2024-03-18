package leetcode.array.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 1, 8, 8, 9};
        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }


    // HashMap takes constant time for retrieving and storing elements.
    // TC is constant for containsKey but for containsValue its O(n)
    // O(n), O(n) in worst case we have to add all the element in map.
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }

        return null;
    }


    // brute force approach. Two nested loops
    // O(n^2), O(1)
    static int[] twoSum3(int[] nums, int target) {
        int[] n = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return n;
    }

}

/*
With HashMap, we can achieve an average time complexity of O(1) for the put and
get operations and space complexity of O(n).
 */

