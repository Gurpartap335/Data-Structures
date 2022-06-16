package leetcode.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); ++i) {
            s.add(sentence.charAt(i));
        }
        return s.size() == 26;
    }
}
