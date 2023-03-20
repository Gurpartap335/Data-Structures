package lecture.oop.exception;

/**
 * error non-recoverable
 * exception
 *
 * Throwable
 * - exception
 * -- checked(during the compile time) file does not exit.
 * -- unchecked (during running time) divide by zero
 * - errors
 *
 * throws declaring exception
 * throw
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        try {
//            int c = a/b;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Yooo");
//        }

//        try {
//            divide(a, b);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This will always execute");
//        }

        try {
            String name = "rem";
            if (name.equals("rem")) {
                throw new MyException("My name is rem");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yo");
        }


    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;



    }
}
