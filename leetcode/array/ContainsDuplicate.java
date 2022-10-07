package leetcode.array;

//import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 9, 2, 1};
    }

    static boolean containsDuplicateUsingSet(int[] arr) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i : arr) {
            if (nums.add(i)) { // add function return false if element already exit so use ! operator.
                return true; // duplicate element exit
            }
        }
        return false;
        /*
        Set represents a generic "set of values".
        TreeSet is a where the elements are sorted or ordered.
        HashSet is set where the elements are not sorted or ordered
         */
    }

//    static boolean containsDuplicateMap(int[] arr) {
//        Map<Integer, Integer> nums = new HashMap<>();
//        for (int i : arr) {
//            if (nums.containsKey(i)) {
//                return true;
//            } else {
//                nums.put(nums[i], 1);
//            }
//        }
//        return false;
//    }

    static boolean containsDuplicateUsingArrayList(int[] arr) {
        // why can not we use arraylist in this case.
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i : arr) {
            if (nums.contains(i)) {
                return true;
            }
            System.out.println(nums);
            nums.add(i);
        }

        return false;
    }
}

/*
Collection framework is the root interface in the collection hierarchy.
A collection represents a group of objects, known as its elements.
Some collections allow duplicate elements other do not. Some are ordered and other unordered.
 */


class Sets {

    public static void main(String[] args) {
//        sets don't store duplicate, all their elements are unique.
        final java.util.Set<String> basicSet = new HashSet<>();
        basicSet.add("1");
        basicSet.add("2");
        basicSet.add("3");
        basicSet.add("4");
//        basicSet.add(1);
//        basicSet.add(2);
//        basicSet.add(3);
        basicSet.add("5");
        System.out.println(basicSet);
        System.out.println(basicSet.toString());
//
//        List<String> strings = new ArrayList<String>();
//        strings.add("Two");
//        strings.add("Three");
//        strings.add("Four");
//        strings.add("Five");
//        strings.add(0,"One");
//        System.out.println(strings);
//
//        List<String> strings2 = Arrays.asList("One", "Two", "Three");
//        System.out.println(strings2);
    }
}