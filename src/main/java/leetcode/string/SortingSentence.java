package leetcode.string;

import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(str));

    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];

        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            bucket[index] = word.substring(0, word.length() - 1); // word.length - 1 to remove numeric value
        }
        return String.join(" ", bucket);
    }
}
