package lecture.basic.tutorials;

import java.util.*;

public class MapAndHashMap {
    public static void main(String[] args) {
        // creating an empty hash map by declaring object of string and integer type.

//        HashMap<String,Integer> empID = new HashMap<>();
//        empID.put("Iron",1);
//        empID.put("Yo",2);
//        empID.put("thor",3);
//        empID.put("hulk",4);
//
//        System.out.println(empID);
//        empID.get(1);
//        empID.get("Yo");
//
//        System.out.println(empID.get("hulk") + " " + empID.get("Yo"));

//        // new hashmap
//        HashMap<Integer,String> empId2 = new HashMap<>();
//        empId2.put(1,"Superman");
//        empId2.put(2,"tupac");
//        empId2.put(3,"sdff");
//
//        System.out.println(empId2.get(1) + " " + empId2.get(3) + " " +  empId2.get(2));
////        System.out.println(empId2.get("tupac")); // tupac is value of key 2
//
//        System.out.println(empId2.containsValue("sdff"));


        HashMap<Integer,String> car = new HashMap<>();
        car.put(1,"amv");
        car.put(2,"qwe");
        car.put(3,"qwer");

        System.out.println(
                car.containsValue("amv") + " " +
                car.containsKey(4) + " " +
                        car.get(2) + " "

        );


//        System.out.println(car);
//        Map<String,Integer> a = new Map<String, Integer>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean containsKey(Object key) {
//                return false;
//            }
//
//            @Override
//            public boolean containsValue(Object value) {
//                return false;
//            }
//
//            @Override
//            public Integer get(Object key) {
//                return null;
//            }
//
//            @Override
//            public Integer put(String key, Integer value) {
//                return null;
//            }
//
//            @Override
//            public Integer remove(Object key) {
//                return null;
//            }
//
//            @Override
//            public void putAll(Map<? extends String, ? extends Integer> m) {
//
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Set<String> keySet() {
//                return null;
//            }
//
//            @Override
//            public Collection<Integer> values() {
//                return null;
//            }
//
//            @Override
//            public Set<Entry<String, Integer>> entrySet() {
//                return null;
//            }
//        }
    }
    /*
    it provides the basic implementation of the Map interface of java.
    It stores data in (key,value) pairs
    Map is collection of key value pairs .
     */
}
