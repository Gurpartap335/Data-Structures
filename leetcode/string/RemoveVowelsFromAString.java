/*
https://leetcode.com/problems/remove-vowels-from-a-string/

Given a string S, remove the vowels from it
return new string.
 */
package leetcode.string;

import java.util.HashSet;
import java.util.Scanner;

import java.lang.String;
import java.util.Set;

public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String n = in.nextLine();

        System.out.println(removeVowels(n));
    }

    static String removeVowels(String s) {

        StringBuilder resultString = new StringBuilder();
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (char c:s.toCharArray()) { // foreach c in s. (toCharArray converting string to character)
            if(!vowels.contains(c)) {
                resultString.append(c);
            }
        }

        // convert the stringbuilder to string
        return resultString.toString();
    }
}
/*
Algorithm

create a stringbuilder object to return the resulting string.
create a hash ser and all the vowels into it.
Iterate through the given string and append the characters to the stringbuilder only if it's not a vowel.
Convert the stringbuilder object to a string.
 */

/*
String Each method you invoke on a string creates a new object and return it.
String is immutable

StringBuilder is mutable.
when you call append() it alters the internal char array
 */