/*
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
package leetcode.string;

import java.util.Scanner;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {

    }

    static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0;i < sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }
}
