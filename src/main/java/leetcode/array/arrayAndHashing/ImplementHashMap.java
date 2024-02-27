package leetcode.array.arrayAndHashing;

import java.util.*;

public class ImplementHashMap<K, V> {

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size; // number of nodes in HashMap

    private LinkedList<Node>[] buckets; // N = buckets.length

    public ImplementHashMap() {
        initBuckets(4);
        size = 0;
    }

    public void initBuckets(int N) {
        buckets = new LinkedList[N];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    /**
     * Check if key is already present in the map then update the value
     * if it's not there then insert key value pair as node in linked list
     * lambda = n/N
     * lambda <= k(threshold value)
     * TC : O(lambda)
     */
    public void put(K key, V value) {
        int bucketIndex = hashFunc(key);
        int dataIndex = getIndexWithInBucket(key, bucketIndex);

        if (dataIndex == -1) {
            Node node = new Node(key, value);
            buckets[bucketIndex].add(node);
            size++;
        } else {
            Node node = buckets[bucketIndex].get(dataIndex);
            node.value = value;
        }

        double lambda = size * 1.0 / buckets.length;
        if (lambda > 2.0) {
//            System.out.println("Key: " + key + "Value : " + value); // to check after which insertion we have to rehash
            rehash();
        }
    }

    public void rehash() {
        LinkedList<Node>[] newBucket = buckets;
        initBuckets(newBucket.length * 2);
        size = 0; // number of nodes

        for (int i = 0; i < newBucket.length; i++) {
            for (Node node: newBucket[i]) {
                put(node.key, node.value);
            }
        }
    }

    private int hashFunc(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % buckets.length;
    }

    private int getIndexWithInBucket(K key, int bucketIndex) {
        int dataIndex = 0;
        for (Node node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                return dataIndex;
            }
            dataIndex++;
        }
        return -1;
    }


    public V get(K key) {
        int bucketIndex = hashFunc(key);
        for (Node node: buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int bucketIndex = hashFunc(key);
        for (Node node: buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public V remove(K key) {
        int bucketIndex = hashFunc(key);
        int dataIndex = getIndexWithInBucket(key, bucketIndex);

        if (dataIndex != -1) {
            Node node = buckets[bucketIndex].remove(dataIndex);
            size--;
            return node.value;
        } else {
            return null;
        }
    }

    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();

        for (int i = 0; i < buckets.length; i++) {
            for (Node node : buckets[i]) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < buckets.length; i++) {
            for (Node node : buckets[i]) {
                System.out.println(node.key + " " + node.value);
            }
        }
    }


    public static void main(String[] args) {
        ImplementHashMap<String, Integer> map = new ImplementHashMap<>();
        map.put("Pink tape", 7);
        map.put("Donda", 7);
        map.put("Utopia", 7);
        map.put("Still rollin", 9);
        map.put("Four You", 8);
        map.put("Hard Choices", 8);
        map.put("Not By Chance", 8);
        map.put("Whole lotta red", 8);
        map.put("PlayBoi Carti", 8); // rehash
        map.put("Die Lit", 9);
        map.put("Whole lotta red", 9);
        map.display();
        System.out.println(map.size);
        System.out.println(map.containsKey("Die Lit"));
        System.out.println(map.containsKey("Moosetape"));
        System.out.println(map.get("Die Lit") + " " + map.get("Whole lotta red"));
        System.out.println(map.get("Die Lit") + map.get("Whole lotta red"));
        System.out.println(map.get("Pinnk"));
        System.out.println(map.remove("Pink tape"));
        System.out.println(map.remove("Donda"));
        System.out.println(map.remove("Four You"));

        map.display();
        System.out.println(map.size);

        System.out.println(map.keySet());

    }
}

/**
 * Array of Linked List
 * Load factor
 */


/**
 * Java equals and hashcode methods are present in Object class.
 * So every java class gets the default implementation of equals() and hashcode().
 */
class HashCode<K> {

    public static void main(String[] args) {

    }
}
/**
 * A remainder is always less than or equal to the divisor.
 * A modula is taking the remainder.
 */