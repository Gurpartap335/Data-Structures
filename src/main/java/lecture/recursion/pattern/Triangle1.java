package lecture.recursion.pattern;

public class Triangle1 {
    public static void main(String[] args) {
        printTriangleR(4, 0);
        print(4);
    }

    static void printTriangleI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printTriangleR(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            printTriangleR(r, c + 1);
        } else {
            System.out.println();
            printTriangleR(r - 1, 0); // set c to zero again
        }
    }


    // this works
    //  using recursion
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        print(n - 1);
    }
























}

/**

 *   *   *   *
 *   *   *
 *   *
 *

 */
