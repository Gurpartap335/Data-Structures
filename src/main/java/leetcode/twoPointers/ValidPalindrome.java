package leetcode.twoPointers;

// https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }


    // without using regex
    // Time Complexity: O(n) space complexity: O(1)
    // debug at least one time on paper and computer with different examples
    // https://leetcode.com/problems/valid-palindrome/solutions/40291/java-9ms-solution-with-some-of-my-thoughts/
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // using regex.
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



class Test {
    public static void main(String[] args) {

//        String str = "A man, a plan, a canal: Panama";
//        System.out.println(str);
//        str = str.replaceAll("[^A-Za-z0-9]", "");
//        System.out.println(str);

//        String a = "hello";
//        System.out.println("hello".replace('l', 'L'));
//        a = a.replace("o", "world");
//        System.out.println(a);

        System.out.println("aaaabbbcccc".replace('a', 'd'));
        System.out.println("Utopia".toLowerCase());
        System.out.println("Donda".replace('d', 'D'));
        System.out.println("Donda ".replace(' ', '2'));

        String str = "donda, ::; , topia,, travis";
        System.out.println(str.replaceAll("[^a-z0-9]", ""));
    }
}