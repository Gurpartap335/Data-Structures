package lecture.recursion.intro;

/**
 * How do function calls work?
 */

public class FunctionCall {
    public static void main(String[] args) {
        print(1);
//        random(1);
    }

    // gives StackOverFlow error. when application recurses too deeply.
    static void random(int n) {
        System.out.println(n);
        random(n);
    }
    static void print(int n) {
        System.out.println(n);
        print2(n + 1);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(n + 1);
    }

    static void print3(int n) {
        System.out.println(n);
    }
}
/**
 * While the function is not finished executing it will remain in the stack
 * memory.
 *
 * when the function finishes executing it is removed from the stack and the
 * program flow is restored to where that function was called previously.
 */
