/*
https://leetcode.com/problems/build-array-from-permutation/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(buildArray(nums)));

//        int[] ans = buildArray(nums);
//        System.out.println(Arrays.toString(ans));
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
