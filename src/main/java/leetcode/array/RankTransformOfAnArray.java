package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {

    public static void main(String[] args) {

    }

    // TC :O(n logn)
    // SC : O(n)
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArray = arr.clone();

        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : sortedArray) {
            map.putIfAbsent(e, map.size() + 1);
        }
        // putIfAbsent is faster than containsKey + put method?

        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = map.get(arr[i]);
        }

        return sortedArray;

    }
}
