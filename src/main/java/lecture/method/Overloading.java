package lecture.method;

// https://www.java67.com/2019/04/difference-between-overloading-overriding-hiding-shadowing-and-obscuring-in-java-oop.html


/**
 * Method signature which is made of the number, type, and order of argument.
 * - number of arguments.
 * - type of arguments.
 * * - order of arguments.
 *
 * compile time.
 */
public class Overloading {
    public static void main(String[] args) {
        show("Hello");
        show(3);

        // println() method in the PrintStream class which is overloaded to accept
        // an int double char String
        System.out.println(1); // int
        System.out.println(4.33); // double
        System.out.println('c'); // char
        System.out.println(true); // boolean
        System.out.println(4.55f); // float

        sum(3.43, 4);
        sum(5, 232.2);

        sum();
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3);

    }

    public static void show(String message) {
        System.out.println("String: " + message);
    }

    public static void show(int content) {
        System.out.println("int: " + content);
    }

    // order of argument
    static void sum(int a, double b) {
        System.out.println(a + b);
    }

    static void sum(double a, int b) {
        System.out.println(a + b);
    }

    // number of argument
    static void sum() {
        System.out.println(Math.random());
    }

    static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a) {
        System.out.println(a);
    }


}


class Overriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.watch();
        c.watch();
    }
}

class Parent {
    public void watch() { // overridden method
        System.out.println("Parent watching movies");
    }
}

class Child extends Parent {
    @Override // resolved at the runtime
    public void watch() { // overriding method
        System.out.println("Child watching Cartoons");
    }
}


// Hiding variable method
class Parent2 {
    int age = 30;

    public static String info() {
        return "Born in 1992";
    }
}

class Child2 extends Parent2 {
    int age = 1;
    public void age() {
        System.out.println("Just age:" + age);
        System.out.println("Parent's age: " + super.age);
        System.out.println("Child's age: " + this.age);
    }

    public static String info() {
        return "Born in 2018";
    }

    public void show() {
        System.out.println("info: " + info());
        System.out.println("Parent's info: " + Parent2.info());
        System.out.println("Parent's info: " + super.info());
        System.out.println("Child's info: " + Child2.info());
    }
}

class Code2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
//        System.out.println(c.age);
//        c.age();

        c.show();
    }
}


// Shadowing
class Parent3 {
    int age = -23432;
    static int staticAge = 432;

    public static void main(String[] args) {
        System.out.println(staticAge);
    }
}

class Child3 extends Parent3 {
    private int age = 1;

    public void show() {
        int age = 5;
        System.out.println(age); // 5
        System.out.println(super.age); // -23432
        System.out.println(this.age); // 1
    }
}

class Code3 {
    public static void main(String[] args) {
        Parent3 p = new Parent3();
        System.out.println(p.age);

        Child3 c = new Child3();
        c.show();


    }
}

// Obscuring when variable and class has similar name in java.

// Compile time error.
//class Code4 {
//
//    public static void main(String[] args) {
//        String System = "Obscuring";
//        System.out.println(System);
//    }
//}