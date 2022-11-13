package lecture.recursion.level1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(-4));
        System.out.println(fact(0));
        System.out.println(fact(1));
        System.out.println(fact(7));
    }

    static int fact(int n) {
        if (n < 2) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
