package lecture.recursion.level1;

// 123321
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1234431));
        System.out.println(isPalindrome(111111));
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static int reverse(int n, int a) {
        if (n == 0) {
            return a;
        }

        return reverse(n / 10, (a * 10) + n % 10 );
    }

    // I can use helper function here.
    public static boolean isPalindrome(int n, int a, int temp) {

        if (temp == a) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        return isPalindrome(n / 10 , (a * 10) + n % 10, temp);
    }

}
