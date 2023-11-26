/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
package leetcode.binarySearch;


public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

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
        // letters.length because we're getting out of bound(s = mid + 1) and letters wrap around.
    }
}
