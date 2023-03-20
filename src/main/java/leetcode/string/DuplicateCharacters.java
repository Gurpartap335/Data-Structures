package leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Java Program to find duplicate characters in String.
 */

public class DuplicateCharacters {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String string = s.nextLine();

        printDuplicatesCharacters(string);

    }

    // print or return duplicate characters in string.

    static void printDuplicatesCharacters(String word) {
        char[] charArray = word.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : charArray) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    @Test
    public void checking() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void checking2() {
        Assert.assertEquals(1, 10);
    }
}