package leetcode.array.arrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(product(arr)));
    }

    // brute force approach
    // O(n^2) O(n)
    public static int[] product(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                product *= arr[j];
            }
            ans[i] = product;
        }
        return ans;
    }


}
