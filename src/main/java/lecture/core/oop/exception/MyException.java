package lecture.core.oop.exception;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class CustomException {

    static void findIfValid(int count) throws MyException {
        if (count == 0) {
            throw  new MyException("Not valid");
        } else {
            System.out.println("THere is no exception");
        }
    }

    public static void main(String[] args) {
        try {
            findIfValid(0);
        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println("This is + " + e);
        }
    }
}