package leetcode.stack;


import java.util.*;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {

        System.out.println(unique2("aabb"));

    }

    public static int unique(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int unique2(String s) {
        Queue<Character> queue = new LinkedList<>();

        for(int j = 0; j < s.length(); j++) {
            queue.add(s.charAt(j));
        }

        int len = s.length();
        char ch;
        while(len > 0) {
            ch = queue.remove();
            if(!queue.contains(ch)) {
                return s.indexOf(ch);
            } else {
                queue.add(ch);
            }
            len--;
        }
        return -1;
    }


}
