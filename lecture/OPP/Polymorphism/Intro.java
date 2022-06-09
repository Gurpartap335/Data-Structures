package lecture.OPP.Polymorphism;

public class Intro {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
/*
Polymorphism in java is a concept by which we can perform a single action in different ways.

There are two types of polymorphism in java
compile-time polymorphism
runtime polymorphism

Runtime polymorphism or dynamic method dispatch is a process in which a call to overridden method is
resolved at runtime rather than compile-time.
 */

// upcasting
// A a = new B();

class Shape{
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle extends Shape{
    void draw() {
        System.out.println("drawing triangle");
    }
}

// A method is overridden, not the data members, so runtime polymorphism can be achieved by data members.