package lecture.core.oop.constructor;

/**
 * Constructor chaining is the process of calling one constructor from another
 * constructor with respect to current object.
 * Constructor chaining occurs through inheritance.
 *
 * reasons for chaining: avoid duplicate code
 *
 * this()
 * super() calls the parent constructor with no arguments. it can be used to call
 * methods from the parent super.aMethod()
 *
 * Super is used to access methods of the base class while this is used to access
 * methods of the current class. same with super() and this() with constructor.
 * init block
 */
public class ConstructorChaining {

    ConstructorChaining(int x, int y) {
        System.out.println(x + " " + y);
    }

    ConstructorChaining(int x) {
        this(4, 6);
        System.out.println(x);
    }
    ConstructorChaining() {
        this(4);
        System.out.println("Default constructor");
    }


    public static void main(String[] args) {
        ConstructorChaining cc = new ConstructorChaining();
    }
}


class A {
    A() {
        this(34);
        System.out.println("Class A");
    }

    A(int a) {
        this("Luffy");
        System.out.println(a);
    }

    A(String name) {
        this("Nami", "Nojiko");
        System.out.println(name);
    }

    A(String name1, String name2) {
        this(453443323.323);
        System.out.println(name1 + " " + name2);
    }

    A(Double a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
        A a = new A("Shanji");
    }
}

class Base {
    {
        System.out.println("INIT block");
    }
    String name;

    Base() {
        this("");
        System.out.println("No argument constructor of base");
    }

    Base(String name) {
        this.name = name;
        System.out.println(
                "Calling parameterized constructor of base"
        );
    }
}

class Derived extends Base {
    {
        System.out.println("INIT block 2");
    }
    Derived() {
        System.out.println("No argument");
    }

    Derived(String name) {
        super(name);
        System.out.println("Calling parameterized constructor of Derived");
    }

    public static void main(String[] args) {
        Derived obj = new Derived("Test");
    }
}


class B{

    B() {
        System.out.println("Class B");
    }

    B(String name) {
        System.out.println("Hello " + name);
    }

}

// extend class(inheritance)
class C extends B{

    C() {
        super();
        System.out.println("Class C");
    }

    C(String name) {
        super("Usopp");
        System.out.println("Hello " +  name);
    }
    public static void main(String[] args) {
        C c = new C();
//        C c2 = new C("Luffi");

    }
}

class Dog {

    int a = 1000;
    Dog() {
//        this(3);
        System.out.println("Dog is created");
    }

    Dog(int n) {
//        this(3, 4);
        System.out.println(n + " Dog is created");
    }

    Dog(int a, int b) {
        System.out.println(a + " " + b + " Dog is created");
    }

    Dog(String color) {
        super();
        System.out.println("Dog color: " + color);
    }

    public void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
//        Dog d = new Dog();
//        Dog d2 = new Dog(2);
//        Dog d3 = new Dog(3, 5);
    }
}

class Cat extends Dog {

    int a = 10;
    Cat() {
        super();
        System.out.println("Cat is created");
    }

    Cat(String color) {
        super("black");
        super.hello();
        System.out.println("Cat color: " + color);
        super.hello();
    }

    void print() {
        System.out.println("a : " + a);
        System.out.println("this.a : " + this.a);
        System.out.println("super.a : " + super.a);

    }

    public static void main(String[] args) {
        Cat c = new Cat("Orange");
        System.out.println(c.a);
        c.print();

    }

}