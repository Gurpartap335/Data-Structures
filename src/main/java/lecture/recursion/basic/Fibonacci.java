package lecture.recursion.basic;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboTail(260, 0, 1));
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }
        // not tail recursion
        // extra step of addition then returning is not tail recursion
        // double recursion
        return fibo(n-1) + fibo(n-2);
    }


    // tail recursion
    // more efficient
    public static long fiboTail(long n, long a, long b){
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fiboTail(n - 1, b, a + b);
    }

    // iterative
    public static int fiboI(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0, b = 1, temp = 0;
        while (n-- > 1) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b; // also can return temp
    }
}

// 0 1 1 2 3 5 8 13 21
// 0 1 2 3 4 5 6 7  8
// 1. try to see if you can divide problem into sub-problems.
// F(n) = F(n - 1) + F(n - 2) recurrence relation
// 2. The base condition is represented by answers we already know.