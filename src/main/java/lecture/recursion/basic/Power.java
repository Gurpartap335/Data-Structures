package lecture.recursion.basic;

// Write a program to calculate the power of a number like power(2, 3) should
// return 8. solve its using recursion.
public class Power {

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(powerI(2, 3));
        System.out.println(powerR(2, 3));
    }

    // tail
    public static int power(int n, int e) {
        return power(n, e, n);
    }

    public static int power(int n, int e, int a) {
        if (e < 2 || n < 2) {
            return a;
        }

        return power(n, e - 1, a * n);
    }


    public static int powerR(int n, int e) {
        if (e < 2 || n < 2) {
            return n;
        }

        return n * power(n, e - 1);

    }

    public static int powerI(int n, int e) {
        if (n < 2 || e < 2) {
            return n;
        }
        int a = 1;
        while (e-- > 0) {
            a *= n;
        }
        return a;
    }

}

// dry recursion tree
