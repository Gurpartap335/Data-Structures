// https://leetcode.com/problems/missing-number/
package leetcode.array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

    }

    // O(n logn), O(log n)
    public int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    // O(n), O(1)
    public int missingNumber2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum -= nums[i];
        }

        return sum + nums.length;
    }

    // binary search

//    public static int missingNumber3(int[] nums) {
//        Arrays.sort(nums);
//
//    }


    //xor -> a^b^b =a
    public int missingNumber3(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
            x ^= i ^ nums[i];
        }
        return x;
    }


    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            }
            else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


// https://florian.github.io/xor-trick/