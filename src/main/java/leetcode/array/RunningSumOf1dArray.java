package leetcode.array;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
    public static void main(String[] args) {


    }

    static int[] runningSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1]; // arr[i] = arr[i] + arr[i - 1] , starting index is 1
        }
        return arr;
    }
}