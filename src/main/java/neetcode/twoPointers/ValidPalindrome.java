package neetcode.twoPointers;

// https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }


    // without using regex
    // Time Complexity: O(n) space complexity: O(1)
    //  debug at least one time on paper and computer with different examples
    // https://leetcode.com/problems/valid-palindrome/solutions/40291/java-9ms-solution-with-some-of-my-thoughts/
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) { // return true if char is letter or digit
                // if it's not letter then increase pointer we can not compare it with other
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) { // if character is not letter then move forward
                right--; // if it is letter then we would compare it would the j index character
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // using regex
    // regex will remove all the characters that are not a-z or 0-9.
    // TC : O(n) space complexity will not be constant we are using inbuilt
    // function.
    public static boolean isPalindromeRegex(String s) {
        s = s.toLowerCase().replaceAll("[^a-z1-9]", "");

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        String actual = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }


}
