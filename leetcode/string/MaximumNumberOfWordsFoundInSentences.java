/*
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
package leetcode.string;

import java.util.Scanner;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String[] n = new String[4];
//        for (int i = 0; i < n.length; i++) {
//            n[i] = s.nextLine();
//        }
//
//
//        System.out.println(mostWordsFound(n));
//        System.out.println(Arrays.toString(n));

        // split
//        String name = "Hello my name is Gurpartap Singh";
//        System.out.println(name.split(" ").length);
//        String[] part = name.split(" ");
//        String part1 = part[0];
//        String part2 = part[1];
//        for (int i = 0; i < part.length; i++) {
//            System.out.println(part[i]);
//        }
    }

    static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0;i < sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
    }
}
