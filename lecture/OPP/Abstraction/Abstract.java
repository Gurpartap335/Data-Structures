package lecture.OPP.Abstraction;

public class Abstract {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}
/*
A class which is declared with the abstract keyword is known as an abstract class in Java.

Abstraction in java
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- abstraction lets you focus on what object does instead of how it does it.

there are two ways to achieve abstraction in java.
- abstract class
- interface
 */


/*
Bike is an abstract class that contains only one abstract method run.
its implementation is provided by the honda class.
 */
abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    void run() {
        System.out.println("running safely");
    }
}