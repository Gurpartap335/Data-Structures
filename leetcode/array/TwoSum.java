package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int target = s.nextInt();
        System.out.println(Arrays.toString(twoSum2(nums,target)));
    }

//    static int[] twoSum(int[] nums, int target) {
//        int[] n = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = 1; j < nums.length; j++) {
//                if (i == j || i > j) {
//                    continue;
//                }
//                else if (nums[i] + nums[j] == target) {
//                    n[0] = i;
//                    n[1] = j;
//                    return n;
//                }
//            }
//        }
//        return n;
//    }

    static int[] twoSum2(int[] nums, int target) {
        int[] n = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                n[1] = i;
                n[0] = map.get(target - nums[i]);
                return n;
            }
            map.put(nums[i],i);
        }
        return n;
    }
}
