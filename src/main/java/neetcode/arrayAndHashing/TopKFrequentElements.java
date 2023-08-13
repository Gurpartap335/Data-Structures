package neetcode.arrayAndHashing;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {


    }

//    public int[] topKFrequentElements(int[] num, int k) {
//
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int i = 0; i < num.length; i++) {
//            frequencyMap.put(num[i], frequencyMap.getOrDefault(num[i], 0) + 1);
//        }
//
//        List<Integer>[] bucket = new List[num.length + 1];
//
//        for (int i = 0; i < bucket.length; i++) {
//            bucket[i] = new ArrayList<>();
//        }
//
//        for (int key : frequencyMap.keySet()) {
//            bucket[frequencyMap.get(key)].add(key);
//        }
//
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < bucket.length; i++) {
//            res.addAll(bucket[i]);
//            if (res.size() >= k) {
//                break;
//            }
//        }
//        return res;
//    }
}
