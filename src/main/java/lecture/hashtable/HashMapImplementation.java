package lecture.hashtable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 3);
        map.put('n', 1);
        map.put('m', 111);
        map.put('r', 1);
        map.put('g', 21);

        int maxValue = Collections.max(map.values());

        for (char e : map.keySet()) {
            if (maxValue == map.get(e)) {
                System.out.println("Key with max value: " + e);
            }
        }

        // print Key which has maximum value
//        Map.Entry<Character, Integer> maxEntry = null;
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
//                maxEntry = entry;
//            }
//        }
//
//        System.out.println(maxEntry.getKey());
//
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        map1.put('a', 3);
//        map1.put('n', 1);
//        map1.put('g', 2);
//        map1.put('m', 1);
//        map1.put('r', 1);
//
//        System.out.println(map.equals(map1));

    }
}

/**
 * HashMap uses a hashtable, however, it is internally implemented using two data
 * structures namely an array and a linked list.
 * Whenever you declare a hashmap, internally, it will create an array of buckets.
 * The buckets are referred to as nodes, or you can say a linked list.
 *
 * Node can represent:
 * HashCode
 * Key Value
 * Address of the next node
 *
 * Java 8 BST
 */
