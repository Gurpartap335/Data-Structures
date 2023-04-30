package lecture.recursion.intro;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwoR(16));

    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    // using recursion
    public static boolean isPowerOfTwoR(int n) {
        if (n == 0) {
            return false;
        }
//        if (n == 1) {
//            return true;
//        }
//
//        if (n % 2 != 0) {
//            return false;
//        }
//
//        return isPowerOfTwoR(n/2);
        return (n == 1 || (n % 2 == 0 && isPowerOfTwoR(n/2)));
    }

}
/**
 * can learn about constraints, bit manipulation or more shit with these good three question
 * also draw tree for recursion for this question.
 */