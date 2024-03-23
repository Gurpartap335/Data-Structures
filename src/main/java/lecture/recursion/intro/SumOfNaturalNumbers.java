package lecture.recursion.intro;


// https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sum2(6));
        System.out.println(sum2(0));
        System.out.println(sum2(1));
        System.out.println(sum2(2));
        System.out.println(sum2(6666));
    }

    public static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sum(n - 1, sum + n);
    }

    public static int sum2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum2(n - 1);
    }




}
