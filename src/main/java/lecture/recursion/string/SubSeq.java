package lecture.recursion.string;

import java.util.ArrayList;
import java.util.Arrays;

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
//        subSeq("abc", "");
    }

    static void subSeq(String str, String temp) {
        if (str.isEmpty()) {
            System.out.print(temp + " ");
            return;
        }

        char ch = str.charAt(0); // its creating new string object everytime function get called
        subSeq(str.substring(1), temp + ch); // taking it first
        subSeq(str.substring(1), temp); // then rejecting it.
    }

    static ArrayList<String> subSeqRet(String str, String temp) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(temp);
//            System.out.println(list); // in which order they're getting added in the list
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = subSeqRet(str.substring(1), temp + ch);
        ArrayList<String> right = subSeqRet(str.substring(1), temp);
        left.addAll(right);
        return left;
    }

}
/**
 * Sub-array contiguous sequence in an array  n * (n + 1)/2
 * Subsequence Need not be contiguous , but maintains order (2^n -1)
 * Subset: no need to maintain the order. can be empty 2^n
 */
/**
 * Subsets:
 * Permutations and Combination
 * Subsets -> Non-adjacent collection
 * [3, 5, 9] {} 3 5 9 [3, 5] [3, 9] [5, 9] [3, 5, 9]
 *
 * This pattern of taking some elements and removing some is known as this subset
 * pattern.
 */

