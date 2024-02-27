package leetcode.array.arrayAndHashing;

import java.util.Arrays;

// https://leetcode.com/problems/left-and-right-sum-differences/
public class LeftAndRightSumDifferences {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference2(new  int[]{1, 2, 3, 4})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }

        return nums;
    }

    public static int[] leftRightDifference2(int[] nums) {
        int leftSum = 0, rightSum = 0;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            left[i] = leftSum;
            leftSum += nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightSum;
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            left[i] = Math.abs(left[i] - right[i]);
        }

        return left;

    }
}
