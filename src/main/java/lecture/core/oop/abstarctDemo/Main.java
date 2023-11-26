package lecture.core.oop.abstarctDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(); // son is reference variable bcz it holds reference to object
        son.career();

        Daughter d = new Daughter();
        d.career();
        d.hashCode();


    }
}

/**
 * Abstraction is a process of hiding the implementation details and showing only
 * functionality to the user.
 * Abstraction lets you focus on what the object does instead of how it does it.
 * (object has state and behaviour)
 *
 * Abstract class cannot be instantiated.
 * it can have final methods which will force the subclass not to change the body
 * of the method.
 *
 * Use interfaces when you want a full implementation and use abstract classes
 * when you want partial pieces for your design.
 */
