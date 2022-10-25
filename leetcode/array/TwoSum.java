package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int target = s.nextInt();
        System.out.println(Arrays.toString(twoSumHashMap(nums,target)));
    }

    // brute force approach. Two nested loops
    static int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return n;
    }

    static int[] twoSumHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (ans.containsKey(target - nums[i])) {
                return new int[] {ans.get(target - nums[i]), i}; // get method return the value to which specified key is mapped.(in this case its returning index of that element)
            }
            ans.put(nums[i], i); // store nums array in HashMap object ans. key as nums element and  their index as value.
        }
        return null;
    }

}


// HashTable is obsolete in Java 1.7 and it is recommended to use ConcurrentMap implementation.
// Hashtable is slower than Hashmap.
// HashTable does not allow null keys or values.
// HashMap allows one null key and any number of null values.

class LearningHashMap{
    static HashMap<String, Integer> phonebook = new HashMap<String, Integer>();

    public static void main(String[] args) {
        phonebook.put("Ken", 54344334);
        phonebook.put("Ye", 2);
        phonebook.put("Nav", 2343232);
        phonebook.put("Drake", 123432);
        phonebook.put("Dua", null);

        System.out.println(phonebook);

        phonebook.put("Cat", 3423400);

        System.out.println(phonebook.get("Ye"));
        System.out.println(phonebook.get(123432));
        System.out.println(phonebook.get(2));
        System.out.println(phonebook.get("Nav")); // return object key
        System.out.println(phonebook.keySet()); // random order
        System.out.println(phonebook.entrySet()); // random order
        System.out.println(phonebook.containsKey("Ye"));
        System.out.println(phonebook.containsKey("ERe"));
        System.out.println(phonebook.containsValue(0));
        System.out.println(phonebook.isEmpty());
        System.out.println(phonebook.size());

        System.out.println(phonebook.get("Drake"));

    }
}






