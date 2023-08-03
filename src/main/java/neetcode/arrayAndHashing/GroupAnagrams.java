package neetcode.arrayAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"abcd", "abbc", "cabb", "accc", "abcd", "abcd", "a", "a"};
        System.out.println(Arrays.deepToString(new List[]{groupAnagrams(str)}));
    }

    private static List<List<String>> groupAnagrams(String[] str) {

        Map<Map<Character, Integer>, ArrayList<String>> map = new HashMap<>();

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
                ArrayList<String> list = map.get(fmap);
                list.add(s);
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        for (ArrayList<String> val :
                map.values()) {
            res.add(val);
        }
        return res;

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
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);
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