package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Donda", "Utopia", "Ye", "Yeezus");
        System.out.println(list);
        String str = encode(list);
        System.out.println(str);
        System.out.println(decode(str));

    }


    // O(n)
    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            result.append(s.length()).append("#" ).append(s);
        }
        return result.toString();
    }

    // O(n)
    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j +1, i));
        }
        return list;
    }
}
