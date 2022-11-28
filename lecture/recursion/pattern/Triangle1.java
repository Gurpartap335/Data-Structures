package lecture.recursion.pattern;

public class Triangle1 {
    public static void main(String[] args) {
        printTriangleR(6, 0);
    }

    static void printTriangleI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
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
            printTriangleR(r - 1, 0);
        }
    }
}

/**

 *   *   *   *
 *   *   *
 *   *
 *

 */
