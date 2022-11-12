package lecture.recursion.intro;

// Program that prints message using recursion.

public class MessageProgram {
    public static void main(String[] args) {
        hello(5);
        print5(1);

    }

    // method that prints Hello 5 times
    static void hello(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello");
        hello(n - 1);
     }

     // method that print numbers from 1 to 5
    static void print5(int n) {
        if (n > 5) {
            return;
        } else {
            System.out.println(n);
            print5(n + 1);
        }
    }

}

