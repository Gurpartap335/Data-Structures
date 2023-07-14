package lecture.recursion.permutation;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        pad("", "123");
    }
    public static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ( 'a' + i);
            pad(p + ch, up.substring(1));
        }
    }


    public static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ( 'a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }
}
/**
 * taking and removing
 */