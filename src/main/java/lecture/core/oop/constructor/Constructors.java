package lecture.core.oop.constructor;

// https://www.geeksforgeeks.org/constructors-in-java/
/**
 * Constructor is special method that is used to initialize objects.
 * Java compiler creates a default constructor.
 * Every class in java is the subclass of a class Object.
 *
 * Need of constructor
 * Constructors are used to assign values to class variables at the time of object
 * creation, either explicitly done by the programmer or by java itself.
 *
 * Constructor in java can not be abstract, final, static or synchronized.
 *
 * No-argument constructor: if you do not create constructor with no argument or
 * (any other)
 * then java did not create default constructor.
 *
 * Default constructor is invisible.
 *
 * Default constructor provides the default values to the object like 0, null etc.
 * depending on the type.
 */
public class Constructors {

    Constructors() {
        System.out.println("Object or instance is created.");
        System.out.println(Constructors.class);
        System.out.println(Constructors.this);
    }

    Constructors(Constructors Obj) {
        System.out.println("Object is created");
        System.out.println("Instance is created");
        System.out.println(Obj);
        System.out.println(Constructors.class);
        System.out.println(Constructors.this);
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        Constructors obj1 = new Constructors();
        Constructors obj2 = new Constructors(obj1);
    }

}

class Geek {



    public static void main(String[] args) {
//        Constructors c = new Constructors();
//        System.out.println("Printing object: " + c);

        Geek g = new Geek();
    }
}