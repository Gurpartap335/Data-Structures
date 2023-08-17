package neetcode.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 1, 9, 11, 2};
        System.out.println(Arrays.toString(twoSum(arr, 5)));
    }


    // TC : O(n) SC : O(N)
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

        int[] ans  = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
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



    /**
     * 2  0
     * 3  1
     * 6  2
     * 8  3
     * 1  4
     * 9  5 we have not put this value in the map. 17 - 9 == 8 8 key exits in the map.
     */
}

/**
 * 2 3 6 8 1 9 11 2 7 0 debug with this array target = 4, 11
 */

