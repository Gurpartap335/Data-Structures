package neetcode.arrayAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.deepToString(new List[]{groupAnagrams11(str)}));
    }


    // TC : O(n*m) n : size of string array m : length of word in string array
    // SC : O(n)
    private static List<List<String>> groupAnagrams(String[] str) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

        for (String s : str) {
            HashMap<Character, Integer> fmap = new HashMap<>();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                fmap.put(c, fmap.getOrDefault(c, 0) + 1);
            }
            if (!map.containsKey(fmap)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(fmap, list);
            } else {
                List<String> list = map.get(fmap);
                list.add(s);
            }
        }

        return new ArrayList<>(map.values());

    }

    //update
    private static List<List<String>> groupAnagrams11(String[] str) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

        for (String s : str) {
            HashMap<Character, Integer> fmap = new HashMap<>();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                fmap.put(c, fmap.getOrDefault(c, 0) + 1);
            }
            if (!map.containsKey(fmap)) {
                map.put(fmap, new ArrayList<>());
            }
            map.get(fmap).add(s);
        }
        return new ArrayList<>(map.values());
    }


    //using sorting
    // O(m *n) or O(sum of all chars in str)
    public static List<List<String>> groupAnagrams2(String[] str) {

        // Here Key is String so to match every key we have to sort anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }


    // building key without sorting
    public static List<List<String>> groupAnagrams3(String[] str) {

        // Here Key is String so to match every key we have to sort anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] chars = new char[26];
            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = String.valueOf(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }


// When creating HashMap value can be anything but key can't be anything.
// To become key of hashmap it should have two function equals and hashcode.
}

class HighestFrequencyCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();

        System.out.println(highest(s));

    }

    public static char highest(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        char mfc = s.charAt(0);
        for (char key : map.keySet()) {
            if (map.get(key) > map.get(mfc)) {
                mfc = key;
            }
        }
        return mfc;
    }
}




class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Map<String, Integer> map = new HashMap<>();
//
//        int n = s.nextInt();
//        String ans = s.nextLine();
//        System.out.println(ans);
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter You recent listened albums and its rating");
//            String album = s.nextLine();
//            Integer score = s.nextInt();
//            s.nextLine();
//            map.put(album, score);
//        }

//        System.out.println(map);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Utopia", 9);
        map.put("Donda", 7);
        map.put("Not by Chance", 8);
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map);
        map.put("Utopia", 8);
        System.out.println(map);
        System.out.println(map.size());

        Set<String> set = map.keySet();
        System.out.println(set);

        // print all values form map
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }

        // all retrieving and storing in map happens O(1) time
    }
}

/**
 * Char is the one data type that isn't signed in java.
 * It's a 16-bit unsigned integer.
 * why char is unsigned integer data type in java?
 */


class Random {

    public static void main(String[] args) {
        String str = "abcdz";

        System.out.println(str);

        char[] chars = new char[26];

        System.out.println(Arrays.toString(chars));
        for (char c : str.toCharArray()) {
            chars[c - 'a']++;
        }

        String key = new String(chars);
        System.out.println(key);
        String ans = String.valueOf(chars);
        System.out.println(ans);


        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}