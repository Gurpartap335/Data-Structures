package lecture.string;

public class PrintAllPalindromicSubstrings {

    public static void main(String[] args) {
        String a = "abccbc";
        subString(a);
    }

    public static void subString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (palindrome(s.substring(i, j))) {
                    System.out.println(s.substring(i, j));
                }
            }
        }
    }

    public static boolean palindrome(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();

        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                 return false;
            }
        }
        return true;
    }
}
