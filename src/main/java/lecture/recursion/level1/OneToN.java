package lecture.recursion.level1;

/**
 * Program that print numbers from 1 to n.
 */
public class OneToN {
    public static void main(String[] args) {
        print1(5);
    }

    // recursive
    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }

    static void print1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print1(n - 1);
        System.out.println(n);
    }

    // iterative
    static void printI(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
