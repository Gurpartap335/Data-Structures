/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
package leetcode.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        char[] letters = new char[size];

        System.out.println("Enter element  : ");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = s.next().charAt(0);
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("Enter target character : ");
        char t = s.next().charAt(0);
        System.out.println(nextGreatestLetter(letters,t));

    }

    static char nextGreatestLetter(char[] letters , char target) {

        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (letters[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid +  1;
            }
        }

        return letters[low % letters.length]; // if 5 % 5 = 0 when low and letters.length is same.
        // letters.length because we getting out of bound(s = mid + 1) and letters wrap around.
    }
}
