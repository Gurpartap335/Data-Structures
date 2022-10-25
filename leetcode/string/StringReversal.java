package leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * Java program to reverse a String in place
 * without any additional buffer in Java.
 *
 * @author Gurpartap225
 */

class StringReversal {

    public static void main(String[] args) {
        System.out.println(reverseString2(""));
    }

    /**
     * Java method to reverse a string in-place.
     * @param str
     * @return reverse of String.
     */
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] characters = str.toCharArray();
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            swap(characters, s, e);
            s++;
            e--;
        }
        return new String(characters);
    }
    /**
     * Time complexity: O(n/2) + time taken in swapping, which effectively adds up
     * to O(n) time. This time will increase in the proportion of the length of String.
     * The space complexity is O(1) bcz we are not using any additional memory to reverse
     * string.
     */

    /**
     * Java method to swap two numbers in given array.
     * @param str
     * @param i
     * @param j
     */
    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    /**
     * Java method to reverse String using StringBuilder Class
     * @param s
     * @return String
     */
    public static String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return new String(str);
    }

    /**
     * Java method to reverse String using additional space
     * @param str
     * @return String
     */
    public static String reverseString2(String str) {
        if (str == null || str == "") {
            return str;
        }
        char[] c = str.toCharArray();
        char[] c2 = new char[c.length];

        for (int i = 0, j = c.length - 1; i < c.length; i++, j--) {
            c2[i] = c[j];
        }
        return new String(c2);
    }
    /**
     * TC: O(n)
     * SC: O(n)
     */


    // JUnit test Cases (to test your code)
    @Test
    public void reverseEmptyString() {
        Assert.assertEquals("", reverse(""));
    }

    @Test
    public void reverseString() {
        Assert.assertEquals("cba",reverse("abc"));
    }

    @Test
    public void reverseNullString() {
        Assert.assertEquals(null, reverse(null));
    }

    @Test
    public void reversePalindromeString() {
        Assert.assertEquals("aba", reverse("aba"));
    }

    @Test
    public void reverseOneCharacterString() {
        Assert.assertEquals("a", reverse("a"));
    }

    @Test
    public void reverseSameCharacterString() {
        Assert.assertEquals("aaa", reverse("aaa"));
    }

    @Test
    public void reverseAnagramString() {
        Assert.assertEquals("mary", reverse("yram"));
    }

}
