package lecture.recursion.level1;

/**
 * Write a program to print numbers from n to 1.
 */
public class Nto1 {
    public static void main(String[] args) {
        print(5);
    }

    // iterative
    static void printI(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // recursive
     static void print(int n) {
        if (n == 0) {
            return;
        }
//        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

}
/**
 * A program is called recursive when an entity calls itself.
 * A program is call iterative when there is a loop(or repetition).
 */