package leetcode.LinkedList;

public class ConvertBinaryNumberInALinkedListToInteger {

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(111));
    }

    public static int binaryToDecimal(int n) {
        int ans = 0;
        for (int i = 0; n > 0; i++) {
            ans += n % 10 * square(i);
            n /= 10;
        }
        return ans;
    }
    public static int square(int i) {
        int sr = 1;
        while (i > 0) {
            sr *= 2;
            i--;
        }
        return sr;
    }


}
