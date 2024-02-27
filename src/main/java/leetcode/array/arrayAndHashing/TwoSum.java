package leetcode.array.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 1, 9, 11, 2};
        System.out.println(Arrays.toString(twoSum(arr, 11)));
    }


    // HashMap takes constant time for retrieving and storing elements.
    // time complexity is constant for containsKey but for containsValue its O(n)
    // TC : O(n)
    // SC : O(n) in worst can we have to add all the element in map
    // two numbers return
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i}; // get returns value. we need index to return.
            }
            map.put(arr[i], i);
        }

        // return new int[]{-1, -1};
        return null;
    }

    // using auxiliary space array.
    public static int[] twoSum2(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                int[] ans  = new int[2];
                ans[0] = i;
                arr[1] = map.get(target - arr[i]);// get returns value. we need index to return.
                return ans;
            }
            map.put(arr[i], i);
        }

        return null;
    }


    // brute force approach. Two nested loops
    // TC : O(n^2)
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

/**
 * 2 3 6 8 1 9 11 2 7 0 debug with this array target = 4, 11
 */

//With HashMap, we can achieve an average time complexity of O(1)
// for the put and get operations and space complexity of O(n).

