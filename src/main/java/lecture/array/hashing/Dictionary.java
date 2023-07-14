package lecture.array.hashing;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, 0);
//        map.put(2, 234);
//        map.put(3, null);
//        map.put(4, null);
//        System.out.println(map);
//        System.out.println(map.get(2));

        String s = "A man, a plan, a canal: Panama";
        String ans = s.toLowerCase();
        System.out.println(s);
        System.out.println(ans);

        String mm = s.replaceAll("[^\\w]", "");
        System.out.println(mm);

        String ans2 = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(ans2);
        System.out.println(ans2.toLowerCase());
    }
}
/**
 * Hashset can contain one null value to maintain uniqueness.
 */
