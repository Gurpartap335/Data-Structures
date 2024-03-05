package leetcode.array.arrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }


    // out-of-place
    // TC: O(n), SC O(n)
    public static void moveZeros(int[] nums) {
        int[] temp = nums.clone();

        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                nums[j] = temp[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    // in-place
    // TC : O(n) and SC O(1)
    public void moveZeros2(int[] arr) {
        int snowBallSize = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0){
                arr[i - snowBallSize] = arr[i];
                arr[i] = 0;
            }
        }
    }

    // O(n), O(1)
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

}
