package leetcode.arrayAndHashing;

import java.util.*;

// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(containsDuplicateR(arr));

    }

    // TC: O(n) and SC : O(n)
    // HashMap takes constant time for retrieving and storing elements.
    public static boolean containsDuplicateMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                return true;
            } else {
                map.put(j, 1);
            }
        }
        return false;
    }

    // what will be the time complexity and space complexity
    // add method takes constant time and loop is running n times. where n is the size of the array. O(n)
    // space complexity will be O(n) in worst case set has to add all the elements
    // HashSet take O(1) for remove(), add(), contains()
    public static boolean containsDuplicateSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!(set.add(i))) { // if we try to add duplicate element add method returns false
                return true;
            }
        }
        return false;
    }

    // O(n^2) SC: O(1)
    // using nested for loop
    // Gives Time Limit Exceeded runs too slow but works
    public static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // using sorting
    // O(n log(n)) for loop - n log(n) + n -> O(n log n)
    // SP : O(log n)
    public static boolean containsDuplicate2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // using recursion
    // find TC SC next time
    // TC : for sorting the array O(n log n) n : size of array
    // SC: is the size of recursion stack O(n)
    public static boolean containsDuplicateR(int[] arr) {
        Arrays.sort(arr);
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int i){
        if (i > arr.length - 2) { // see the sign
            return false;
        }

        return arr[i] == arr[i + 1] || helper(arr, i +1);
    }


}


/**
 * Set and Map are abstract data type.
 * A Hashset is an implementation of a set - collection of unique keys.
 * HashMap and hashtable are both implementation of a map - a collection of
 * key value pairs where keys are unique.
 * Hashtable is thread safe but hashmap is not.
 * This means you cannot use HashMap in a multithreaded Java application without
 * external synchronization.
 *
 * Hashmap allows one null key(still unique keys) and null values but Hashtable doesn't allow null
 * key or values.
 * Hashtable thread safety is achieved using internal synchronization, which makes it
 * slower than HashMap.
 *
 * HashMap does not guarantee that the order of the map will remain constant over time
 * so Hashtable?? probably same
 */

// https://medium.com/swlh/hashmap-implementation-for-java-90a5f58d4a5b
// https://javarevisited.blogspot.com/2010/10/difference-between-hashmap-and.html#axzz7zElXqyw1
// https://stackoverflow.com/questions/2817695/how-does-java-order-items-in-a-hashmap-or-a-hashtable
// https://www.java67.com/2012/07/difference-between-arraylist-hashset-in-java.html

/**
 * HashSet: unordered object-based implement Set interface does not allow duplicate element
 * ArrayList: order  index-based implement List interface permits duplicate element
 */


class ContainDuplicateII {

    public static void main(String[] args) {
        System.out.println(brute(new int[]{1, 2, 3, 1}, 3));
    }

    public static boolean containsNearByDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    // TC : O(n)
    // SC : O(n)
    public static boolean containsNearByDuplicate2(int[] nums, int k) {
        if (nums == null || nums.length < 2) return false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // get gives value to which specified key is mapped
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    // sliding window + Set
    public static boolean containsNearByDuplicate3(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    // brute force
    public static boolean brute(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int a = Math.abs(i - j);
                    if (a <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// abstract class vs interface
// https://www.baeldung.com/java-collections-complexity