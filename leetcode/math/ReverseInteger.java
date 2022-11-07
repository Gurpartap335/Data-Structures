package leetcode.math;

// https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public static void main(String[] args) {
//        System.out.println(reverse2(-1234));
//        System.out.println(reverse(1534236469));
    }

    // assume the environment does not allow you to store 64-bit integers
    // (signed or unsigned). You can not use long data type.

    static int reverse(int n) {
        int res1 = 0, res2 = 0, count = 0;
        while (n != 0) {
            count = n % 10;
            res2 = res2 * 10 + count;
            if ((res2 - count) /10 != res1) { // checks for overflow.
                // (res2 - count)/10 restore the previous version of that value.
                // if it rollover then return 0
                return 0;
            }
            res1 = res2;
            n /= 10;
        }
        return res1;
    }

    static int reverseInteger(int n) {
        int num = 0, count = 0, r = 0;
        if (n < 0) {
            n = n * -1;
            r = 1;
        }
        while (n > 0) {
            count = n % 10;
            num = num * 10 + count;
            n /= 10;
        }
        if (r == 1) {
            return (-1) * num;
        } else {
            return num;
        }
    }

    // stringBuffer and try catch
    static int reverse2(int n) {
        try {
            if (n < 0) {
                StringBuffer str = new StringBuffer(String.valueOf(-n));
                str.reverse();
                return -(int)Integer.parseInt(str.toString());
            } else {
                StringBuffer str = new StringBuffer(String.valueOf(n));
                str.reverse();
                return (int)Integer.parseInt(str.toString());
            }
        } catch (Exception e) {
            return 0;
        }
    }
}

/**
 * Java is platform independent. So int is 32 bits and long is 64-bit.
 */
