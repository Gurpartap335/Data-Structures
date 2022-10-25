package leetcode.string;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//        String name = "1.1.1.1";
//        name.matches("par");
//        System.out.println(name);
//
////        System.out.println(defangIP(name));
//        name = name.replaceAll("\\.","[.]");
//        System.out.println(name);
    }

    static String defangIP(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString(); // toString is to generate a string representation of an object.
    }
}
/*
// replace() if you just want to replace some char or string with another char or string(actually character sequence).
// replaceAll if you want to use a regular expression pattern.
// split
// join
// stringbuilder
 */