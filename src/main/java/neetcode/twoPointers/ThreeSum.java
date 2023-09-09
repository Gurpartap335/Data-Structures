package neetcode.twoPointers;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum sum = new ThreeSum();
        int[] arr = {-4, -2, -1, -1, -1, 0, 1, 1, 2, 3};
        System.out.println(Arrays.toString(new List[]{sum.threeSum(arr)}));
        System.out.println(Arrays.toString(new List[]{sum.threeSum2(new int[]{-1, 0, 1, -4, 2, -2})}));
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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return list;
            }
            //to avoid using same element as first element in the list
            // if number is getting repeated continue
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            int sum;
            while (left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    // to avoid adding duplicate lists
                    // move the pointers to new number
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;

    }

    public List<List<Integer>> threeSum2(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        if (arr.length < 3 || arr[0] > 0) {
            return Collections.emptyList();
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                break;
            }
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            int sum;
            while (left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    set.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}



// https://www.youtube.com/watch?v=DhFh8Kw7ymk&ab_channel=takeUforward

