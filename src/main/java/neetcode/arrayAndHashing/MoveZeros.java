package neetcode.arrayAndHashing;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 10, 0, 4, 5, 3, 2, 10, 3, 13, 0, 0});

    }


    // out-of-place
    // TC : O(n) and SC O(n)
    public static int[] moveZeros(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
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

    public static void moveZeros3(int[] nums) {

        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while ( j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }




}
