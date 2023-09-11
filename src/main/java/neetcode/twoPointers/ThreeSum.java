package neetcode.twoPointers;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum sum = new ThreeSum();
        int[] arr = {-4, -3, -2, -2, -2, 0, 1, 2, 4};
        System.out.println(sum.threeSum(arr));

    }

    public List<List<Integer>> threeSumBrute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        if (arr.length < 3) {
            return list;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0 && i != j && j != k && k != i) {
                        List<Integer> curr = new ArrayList<>();
                        curr.add(arr[i]);
                        curr.add(arr[j]);
                        curr.add(arr[k]);
                        //Collections.sort(curr);
                        if (!list.contains(curr)) {
                            list.add(curr);
                        }
                    }
                }
            }
        }
        return list;
    }

    // TC : O(n^2)
    // SC : O(n)
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        if (arr.length < 3) {
            return list;
        }

        Arrays.sort(arr);

        if (arr[0] > 0) {
            return list;
        }
                      // arr.length - 2 works
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return list;
            }

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // to avoid using same element as first element in the list
            }

            int s = i + 1;
            int e = arr.length - 1;
            int sum;
            while (s < e) {
                sum = arr[i] + arr[s] + arr[e];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[s], arr[e]));
                    // to avoid adding duplicate lists move the pointers to new number
                    while (s < e && arr[s] == arr[s + 1]) {
                        s++;
                    }
                    while (s < e && arr[e] == arr[e - 1]) {
                        e--;
                    }
                    s++;
                    e--;
                }
                else if (sum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        return list;
    }
}



// https://www.youtube.com/watch?v=DhFh8Kw7ymk&ab_channel=takeUforward