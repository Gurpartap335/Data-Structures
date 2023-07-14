package leetcode.string;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "the as array join";
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(Arrays.copyOf(str, 2)));
    }

    // using split method.
    public static String truncateSentence(String s, int k) {
        String[] s2 = s.split(" ");
        String[] s3 = new String[k];

        for (int i = 0; i < s3.length; i++) {
            s3[i] = s2[i];
        }
        String str = String.join(" ", s3);
        return str;
    }

    // T: O(n) S:(n)
    // Split function will iterate over the string to split on the basis of " ".
    // that's why time is O(n) not O(k)
    public static String truncateSentence2(String s, int k) {
        String[] s2 = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(s2[i] + " ");
        }
        return sb.toString().trim();
//        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }

    // pointer

}
/**
 * Array.copyOf
 * join
 * spilt
 * more
 */