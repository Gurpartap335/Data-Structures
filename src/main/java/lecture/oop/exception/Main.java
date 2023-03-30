package lecture.oop.exception;

/**
 * https://malshimadurangi.medium.com/exception-handling-in-java-f4e865df58b5
 *
 * The Exception handling in Java is a way to handle to runtime errors.
 * Exception is an object which is thrown at runtime.
 *
 * Problem occurs -> Create Exception -> Throw Exception -> Handle Exception

 *
 * Checked Exception - compile time
 * Unchecked Exception - runtime exception
 * Error is irrecoverable (stackoverflow, numberFormatException)
 *
 * Root Class Throwable
 * -- Exception
 * -- Error
 *
 * try catch finally
 * throws : declaring , used with the method signature
 * throw : used to explicitly throw an exception, used within method
 *
 * Multiple-catch block
 * There can have multi catch blocks but at a time only one exception occurs
 * and only one catch block is executed.
 */
public class Main {
    public static void main(String[] args) {

//        int n1 = 10;
//        int n2 = 20;
//        int n3 = 0;
//        try {
//            n3 = (n1 / 0) * n2; // gives arithmeticException if try catch does not used.
//            System.out.println("Yoo");
//        } catch (ArithmeticException e) {
//            System.out.println("rest of the code under catch block");
//            System.out.println(e);
//            System.out.println(n1);
//            System.out.println(n2);
//            System.out.println(n3);
//        }



        // multiple-catch block
//        try {
//            String s = null;
//            int[] array = new int[10];
//            System.out.println(s.length());
//            System.out.println(array[11]);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//            System.out.println("NullPointerException!");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//            System.out.println("ArrayOutOfBoundException");
//        } catch (Exception e) {
//            System.out.println("ParentException");
//        }



        // nested-try block
        try {
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }

            try {
                int[] arr = new int[10];
                arr[13] = 3432;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            System.out.println("End of inner blocks");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Yooo");
        }

        System.out.println(divide(3,0));
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero.Error");
        }
        return a / b;

    }
}

class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();

        try {
            obj.method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handed!");
        }
    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        System.out.println(3/0);
    }
}
