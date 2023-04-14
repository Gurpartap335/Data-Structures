package lecture.recursion.level1;

public class SumFrom1toN {
    public static void main(String[] args) {
        System.out.println(printR(5, 0));
    }

    public static int print(int n) {
        if (n == 0) {
            return 0;
        }
        return n + print(n - 1);
    }

    // tail recursive
    public static int printR(int n, int a) {
        if (n == 0) {
            return a;
        }
        return printR(n - 1, n + a);
    }
}
