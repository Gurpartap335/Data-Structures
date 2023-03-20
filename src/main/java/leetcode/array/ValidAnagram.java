package leetcode.array;

//https://leetcode.com/problems/valid-anagram/

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ratom";
        String t = "catkq";
//        System.out.println(isAnagram(s,t));
//        System.out.println(isAnagramSort(s, t));


    }


    static boolean isAnagram(String s, String t) {
        // if length is not similar then no need to check further.
        if (s.length() != t.length()) {
            return false;
        }

        // creating a array(container) for storing which letter appears in the string.
        int[] count = new int[26];
        for (int i = 0; i < s.length();i++) {
            count[s.charAt(i) - 'a']++; // s.charAt(i) - 'a' give us index. +1 when letter appears in given string s.
            count[t.charAt(i) - 'a']--; // -1 when letter appears in target string t.
        }

        // if word is anagram then every element in the array is 0.
        for (int i:count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    // using sorting
    static boolean isAnagramSort(String s, String t) {
        if (s.length() == t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        System.out.println(sChar);
        System.out.println(tChar);

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        System.out.println(sChar);
        System.out.println(tChar);

        return Arrays.equals(sChar, tChar);
    }

    // using Hashmap
    static boolean isAnagramHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(t.charAt(i)) == false) return false;
            if (sMap.get(t.charAt(i)) > 1) sMap.put(t.charAt(i), sMap.get(t.charAt(i) - 1));
            else sMap.remove(t.charAt(i));
        }
        return sMap.size() == 0;
    }

}

/*
Different approach i can think of to solve this problem.

Brute force(sorting)
Using HashMap
Using letters property. Unicode something.
 */





class CharacterToString {

    // How can i convert a string to
    public static void main(String[] args) {
//        String s = "Chainsaw Man";
////        s.charAt(10);
//        char c = s.charAt(10);
//        String s2 = Character.toString(c);
//        System.out.println(c);
//        System.out.println(s2);
//

    }
}

// Unicode
class UniCode {
    public static void main(String[] args) {
        int a = 5;
        char c = (char) a;
        System.out.println(c);
        System.out.println(c + 1);
        System.out.println(c + '!');
        System.out.println((char)(c + '!'));
        System.out.println((char)(c + 1)); // unprintable

        c = '\u0905';
        System.out.println(c);
        System.out.println('\u0A17' + "" + '\u0A30');
        System.out.println('\u0A2F');
        System.out.println((int)'\u0A2F');
        System.out.println((char)2607);
        System.out.println('\u0A00');
        System.out.println('\u20B9');

        // difference between unicode and ascii characters.
        System.out.println("\uD87E\uDC1A\uD87E\uDC28");
        System.out.println("\uDC1A\uD87E\uD87E\uDC28");

    }
}

// How characters or Strings store in Java
class CharacterValue {

    public static void main(String[] args) {
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';

        System.out.println(a + ": " + (int)a); // 97
        System.out.println(z + ": " + (int)z); // 122
        System.out.println(A + ": " + (int)A); // 65
        System.out.println(Z + ": " + (int)Z); // 90



        for (int i = 0; i < 58; i++) {
            System.out.print((char)('A' + i) + " ");
        }
        System.out.println();
        for (int i = 1; i < 34; i++) {
            System.out.print((char)('A' - i) + " ");
        }
        System.out.println();

        String s = "12";
        System.out.println(s + ": " + Integer.parseInt(s));
//        System.out.println(Integer.parseInt("Gurpartap Singh")); // it give us error. NumberFormatException


    }
}

// What is Parsing
class Parsing {

    public static void main(String[] args) {
        // Parsing a string of characters is analyzing this string to find tokens, or items and then create a structure from the result.
        // Integer.parseInt on a string is parsing this string to find an integer

        int i = Integer.parseInt("34543");
        System.out.println(i);

        System.out.println(Integer.parseInt("-3443"));
//        System.out.println(Integer.parseInt(null)); // error

        String myString = "1234";
        int foo = Integer.parseInt(myString);
        System.out.println(foo);

        String siu = "12abd";
//        int foo2 = Integer.parseInt(siu); // error
        int foo2;
//        System.out.println(foo2);

        try {
            foo2 = Integer.parseInt(siu);
        } catch (NumberFormatException e) {
            foo2 = 0;
        }

        System.out.println(foo2);
        System.out.println(foo);


        // converting int to string
        int a = 5;
        System.out.println(String.valueOf(a)); // Integer to string

    }
}
