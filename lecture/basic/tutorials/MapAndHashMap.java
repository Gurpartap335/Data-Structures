package lecture.basic.tutorials;

import java.util.HashMap;

public class MapAndHashMap {
    public static void main(String[] args) {
        // creating an empty hash map by declaring object of string and integer type.
        HashMap<String,Integer> empIDs = new HashMap<>();

        empIDs.put("guri",123);
        empIDs.put("abc",23);
        empIDs.put("weer",234);

//        System.out.println(empIDs);
//
//        System.out.println(empIDs.get("guri"));
//
//        System.out.println(empIDs.containsKey("weer") + " "+ empIDs.containsKey("weeer"));
//
//        System.out.println(empIDs.containsValue(234543) + " " + empIDs.containsValue(123));

        if (empIDs.containsValue("guri")) {
            Integer a = empIDs.get("guri");
            System.out.println(a);
        }

    }
    /*
    it provides the basic implementation of the Map interface of java .
    It stores data in (key,value) pairs
    Map is collection of key value pairs .
     */
}
