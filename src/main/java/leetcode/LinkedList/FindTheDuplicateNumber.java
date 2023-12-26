package leetcode.LinkedList;


import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindTheDuplicateNumber {

    public static void main(String[] args) {

    }


    // O(n log n)
    public static int duplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                return nums[i];
            }
        }
        return 0;
    }

    // O(n) + O(n)
    public static int duplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }


    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (fast != slow)
        {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }

}
