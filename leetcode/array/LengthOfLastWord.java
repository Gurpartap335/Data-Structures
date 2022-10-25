package leetcode.array;

import java.util.Locale;
import java.util.regex.Pattern;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello "; //

//        System.out.println(s.length());
//        s = s.trim();
//        System.out.println(s.length());
//        System.out.println("Last Index of " + s.lastIndexOf(' ')); //
//        int lastIndex = s.lastIndexOf(' ') + 1; // starting point of the last word.
//        System.out.println(s.length() - lastIndex);

        // we can also solve this problem by string to char array.
        System.out.println(lastWordLength(s));

//        System.out.println((int)' ');

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
