package lecture.recursion.string;

import java.util.ArrayList;

/**
 * subsequence of sequence is obtained by deleting some or no elements without changing
 * the order of remaining elements.
 * Empty String also printed in the end.
 *
 * subsequence is for strings
 *
 * n^2 - 1
 */
public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subSeqRet("abc", ""));

    }

    static void subSeq(String str, String temp) {
        if (str.isEmpty()) {
            System.out.println(temp);
            return;
        }

        char ch = str.charAt(0);
        subSeq(str.substring(1), temp + ch);
        subSeq(str.substring(1), temp);
    }

    static ArrayList<String> subSeqRet(String str, String temp) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subSeqRet(str.substring(1), temp + ch);
        ArrayList<String> right = subSeqRet(str.substring(1), temp);
        left.addAll(right);
        return left;
    }

}
