package neetcode.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 1, 9, 11, 2};
        System.out.println(Arrays.toString(twoSum(arr, 4)));
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }

        // return new int[]{-1, -1};
        return null;

    }
}

/**
 * 2 3 6 8 1 9 11 2 7 0 debug with this array target = 4, 11
 */

