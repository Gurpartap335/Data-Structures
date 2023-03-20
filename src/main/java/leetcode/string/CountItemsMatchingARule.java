package leetcode.string;

import java.util.Locale;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
//        String s1  = "Gur";
//        String s2 = "par";
//
//        System.out.println(s1 + s2);
//        String s3 = s1 + s2;
//        System.out.println(s3);

        String n = "gurpartap";
        n.toLowerCase(Locale.ROOT);
        String[] str1 = new String[3];
        str1[0] = "ab";
        str1[1] = "bc";
        str1[2] = "ca";
        String[] str2 = {"ab","bc","ca"};

        boolean ans = String.join("",str1).equals(String.join("",str2));

        System.out.println(ans);

    }
}
