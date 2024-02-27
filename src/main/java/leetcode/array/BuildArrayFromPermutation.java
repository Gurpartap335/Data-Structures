/*
https://leetcode.com/problems/build-array-from-permutation/
 */
package leetcode.array;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

    }


    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
/*
ans[i] = nums[nums[i]]
for each 0 <= i < nums.length

constraints ::
0 <= nums[i] < nums.length (no number in array should greater than array length)


Euclid's Division algorithm for O(1) memory
a = r + bq
 */
