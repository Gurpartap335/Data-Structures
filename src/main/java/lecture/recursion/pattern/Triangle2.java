package lecture.recursion.pattern;

/*
*
*   *
*   *   *
*   *   *   *
 */

public class Triangle2 {
    public static void main(String[] args) {
        printTriangleR(3, 0);
//        print(4);
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

    // this works
    //  using recursion
    // when the stack getting empty
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
