package lecture.recursion.level1;

/**
 * Write a program that counts number of zeros.
 */

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(zeros(1000010110));
        System.out.println(zeros(0));
        System.out.println(count(100010110));
        System.out.println(countZeros(1000010110, 0));
        System.out.println(countZeros(0, 0));
        System.out.println(countZeros(6505540, 0));
    }


    // iterative
    static int zeros(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // using helper function
    // use helper function when you know what do you want to put in the argument
    // of the function.
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    public static int countZeros(int n, int c) {
        if (n == 0) {
            return c;
        }

        if (n % 10 == 0) {
            c++;
        }

        return countZeros(n / 10, c);
    }
}
