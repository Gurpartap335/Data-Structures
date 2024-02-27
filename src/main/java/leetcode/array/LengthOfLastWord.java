package leetcode.array;

import java.util.Locale;
import java.util.regex.Pattern;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    // reverse iteration

    // this method also works but trim() method make this code more slower. You also does not to convert string to char Array.
    // if we gonna remove the trim method then we have to make few changes in the method.
    static int lastWordLength(String s) {
//        s = s.trim();
        char[] c = s.toCharArray();

        int j = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                return j;
            } else {
                j += 1;
            }
        }
        return j;
    }
}
