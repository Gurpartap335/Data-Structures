package lecture.recursion.pattern;

/*
*
*   *
*   *   *
*   *   *   *
 */

public class Triangle2 {
    public static void main(String[] args) {
        printTriangleR(4, 0);
    }

    static void printTriangleI(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
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
            printTriangleR(r, c + 1);
            System.out.print("* ");
        } else {
            printTriangleR(r - 1, 0);
            if (r > 1) {
                System.out.println();
            }
        }
    }
}
