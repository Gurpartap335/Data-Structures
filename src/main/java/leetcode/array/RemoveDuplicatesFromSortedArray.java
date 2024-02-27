package leetcode.array;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 2, 2, 3, 3, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    // TC : O(n log n) + O(n) -> O(n log n)
    // SC : O(n)
    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int k = 0;
        for (int i : set) {
            nums[k] = i;
            k++;
        }
        return k;
    }



    // TC: O(n), SC : O(1)
    public static int removeDuplicates2(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }
        return i + 1;
    }
}

// https://simplenotions.wordpress.com/2009/05/13/java-standard-data-structures-big-o-notation/
// https://web.archive.org/web/20111223104325/http://essays.hexapodia.net/datastructures

// two pointer