package lecture.recursion.permutation;

import java.util.ArrayList;

/**
 * Every character is included
 * permutation   : n!
 *
 * No. of recursive calls = size of process + 1
 */
public class Permutation {
    public static void main(String[] args) {
        permutations(" ", "abc");

        System.out.println(permutationsList(" ", "abc"));
    }

    static void permutations(String temp, String str) {
        if (str.isEmpty()) {
            System.out.println(temp);
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i < temp.length(); i++) {
            String f = temp.substring(0, i); // last index is not inclusive.
            String s = temp.substring(i, temp.length());
            permutations(f + ch + s, str.substring(1));
        }

    }

    static ArrayList<String> permutationsList(String temp, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < temp.length(); i++) {
            String f = temp.substring(0, i); // last index is not inclusive.
            String s = temp.substring(i, temp.length());
            ans.addAll(permutationsList(f + ch + s, str.substring(1)));
        }
        return ans;

    }
}

/**
 * SubArray : (n *(n + 1))/2
 * subSet : n ^ 2
 */
