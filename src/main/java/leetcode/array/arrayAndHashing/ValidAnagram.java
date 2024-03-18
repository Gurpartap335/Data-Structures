package leetcode.array.arrayAndHashing;

import java.util.*;

// https://leetcode.com/problems/valid-anagram/
// https://leetcode.com/problems/first-letter-to-appear-twice/
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram3("anagram", "nagrama"));
    }


    // using sorting
    // TC O(n log(n)) SC : O(n)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Arrays.sort(s2);
        Arrays.sort(t2);
        return Arrays.equals(s2,t2);
    }

    // https://leetcode.com/problems/valid-anagram/solutions/66550/share-my-java-solution/
    // Using HashMap data structure.
    // TC : O(n) SC : O(n) n length of string
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s2.length; i++) {
            map1.put(s2[i], map1.getOrDefault(s2[i], 0) + 1);
            map2.put(t2[i], map2.getOrDefault(t2[i], 0) + 1);
        }
        return map1.equals(map2); // for comparing two maps use equal method not ==
    }


    // with strings
    public static boolean isAnagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        System.out.println(map1);
        System.out.println(map2);

        return map1.equals(map2);
    }

    // compare strings
    public static boolean isAnagramStrings2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return s.equals(t);
    }

    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++; // add +1 to index 0 if s.charAt(i) is a.
            alphabet[t.charAt(i) - 'a']--;
        }

        // run 26 times
        for (int i: alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

// https://stackoverflow.com/questions/19212306/whats-the-difference-between-ascii-and-unicode
// https://www.joelonsoftware.com/2003/10/08/the-absolute-minimum-every-software-developer-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/
// https://www.oreilly.com/library/view/java-io/1565924851/ch01s03.html#:~:text=Internally%2C%20Java%20uses%20the%20Unicode,seven%2Dbit%20ASCII%20character%20set.
// How characters store internally in java?
/**
 * Since Computers only really understand numbers, characters are encoded by
 * matching each character in a given script to a particular number.
 * In ASCII encoding
 * A character is mapped to the number 65.
 * B character is mapped to the number 66.
 * <p>
 * Java internally implement Unicode i.e. it supports all worldwide alphabets.
 * Hence, the size of char in java is 2 bytes and range is 0 t0 65535.
 * Unicode is superset of ASCII.
 */



// Unicode
class UniCode {
    public static void main(String[] args) {
        System.out.println((char)37);
        char c = '\u0905';
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
        // Parsing a string of characters is analyzing this string to find tokens,
        // or items and then create a structure from the result.
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
        String str = String.valueOf(a);
        System.out.println(str);

        String str1 = Integer.toString(a);
        System.out.println(str1);

    }
}



// Follow up: What if the inputs contain Unicode characters? How could you adapt
// your solution to such a case?


class Test1 {

    public static void main(String[] args) {
        String album  = "utopia";
        int[] alphabet = new int[26];
        System.out.println(Arrays.toString(alphabet));

        for (char c : album.toCharArray()) {
            alphabet[c - 'a']++;
        }
        System.out.println(Arrays.toString(alphabet));

        // Internally, Java converts the character value to an ASCII value.
        System.out.println("Lets print all lowercase letters with their ASCII value");
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a' + i) +  " " + ('a' + i));
        }

        //char array
        // char arrays are not readable
        char[] chars = new char[26];

        for (char c : album.toCharArray()) {
            chars['c' - 'a']++;
        }

        System.out.println(chars);
        System.out.println(Arrays.toString(chars));

        String key = String.valueOf(chars);
        String key1 = Arrays.toString(chars);
        System.out.println(key);
        System.out.println(key1);

        // https://stackoverflow.com/questions/57704422/why-cant-i-see-the-contents-in-java-char-array-neither-in-eclipse-console-nor-i
    }
}