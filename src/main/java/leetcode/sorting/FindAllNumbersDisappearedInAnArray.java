package leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {


    }

    static List<Integer> cyclic(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            // correct stores the correct index of arr[i]  store the correct index of the element.
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { // if arr[element] = arr[element - 1] then i++;
                swap(arr,i,correct);
            }
            else i++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
if range [0,N]
every element will be at index = value

if range [1,N]
every element will be at index = value - 1
 */
