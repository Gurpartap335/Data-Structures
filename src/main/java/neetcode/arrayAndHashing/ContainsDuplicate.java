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

        System.out.println(containsDuplicateSet(arr));

    }

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

    public static boolean containsDuplicateSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!(set.add(i))) { // if we try to add duplicate element add method gives false
                return true;
            }
        }
        return false;
    }

    //using nested for loop
    // Gives Time Limit Exceeded runs too slow but works
    public static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // using sorting
    public static boolean containsDuplicate2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
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
- sort the array + for loop ->  O(n log(n)) + O(n)
- Hash table Time complexity : O(n) Memory: O(n) n : size of array
 */

/**
 * Set and Map are abstract data type.
 * A Hashset is an implementation of a set - collection of unique keys.
 * HashMap and hashtable are both implementation of a map - a collection of
 * key value pairs where keys are unique.
 * Hashtable is thread safe but hashmap is not.
 * This means you cannot use HashMap in a multithreaded Java application without
 * external synchronization.
 *
 * Hashmap allows one null key(still unique keys.. i think??) and null values but Hashtable doesn't allow null
 * key or values.
 * Hashtable thread safety is achieved using internal synchronization, which makes it
 * slower than HashMap.
 *
 * HashMap does not guarantee that the order of the map will remain constant over time
 * so Hashtable??
 */

//https://medium.com/swlh/hashmap-implementation-for-java-90a5f58d4a5b
// https://javarevisited.blogspot.com/2010/10/difference-between-hashmap-and.html#axzz7zElXqyw1
// https://stackoverflow.com/questions/2817695/how-does-java-order-items-in-a-hashmap-or-a-hashtable
// https://www.java67.com/2012/07/difference-between-arraylist-hashset-in-java.html

/**
 * HashSet: unordered object-based implement Set interface does not allow duplicate element
 * ArrayList: order  index-based implement List interface permits duplicate element
 */