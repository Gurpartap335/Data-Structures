/*
https://leetcode.com/problems/shuffle-the-array/
 */
package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {

    }

    static int[] shuffleArray(int[] nums , int n) {
        int[] res = new int[2*n];

        for (int i = 0; i < n; i++) {
            res[2*i] = nums[i];
            res[2*i + 1] = nums[n + i];
        }
        return res;
    }
}
