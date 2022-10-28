package neetcode.arrayAndHashing;

import java.util.*;

// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(containsDuplicate(arr));

    }

    /**
     * Using Map data structure.
     * @param arr
     * @return true if array contains duplicate else false.
     */
    public static boolean containsDuplicate(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            } else {
                map.put(arr[i], 1);
            }
        }
        return false;
    }

    /**
     * Finding array contains duplicate elements using Set data structure.
     * @param arr
     * @return true if duplicate element exits else false.
     */
    public static boolean containsDuplicateSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!(set.add(i))) { // if we try to add duplicate element add method gives false
                return true;
            }
        }
        return false;
    }

}

/*
We have integer array nums if array contains duplicate elements return true else
return false.

- we can solve this using nested for loop. O(n^2)
- sort the array the for loop O(n log n) + O(n)
- Hashing (Map and Set)
 */


