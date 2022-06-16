package leetcode.String;

import java.util.Arrays;
import java.util.Locale;

public class ToLowerCase {
    public static void main(String[] args) {
//        char c = 'a';
//        System.out.println((int)'a' + " " + (int)'z'); // 97 122
//        System.out.println((int)'A' + " " + (int)'Z'); // 65 90
//
//        String n = "HELLO";
//        System.out.println(n.toLowerCase(Locale.ROOT));
//        n = n.toLowerCase(Locale.ROOT);
//        System.out.println(n);

//        System.out.println((int)'H' + " " + (int)'h');

        String n = "HELLO";
        System.out.println(toLower(n));


    }

    static String toLower(String s) {
        // convert string into char array
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if ('A' <= a[i] && a[i] <= 'Z') {
                a[i] = (char) (a[i] - 'A' + 'a'); // H(72) - 65 -> 7 + 97
            }
        }
        return new String(a);

    }
}


/*
65  - 90 26
97 - 122 26

72 104 32 -> 26 + 6

 */