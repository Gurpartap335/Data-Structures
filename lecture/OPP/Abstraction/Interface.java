package lecture.OPP.Abstraction;

import java.awt.print.Printable;

public class Interface {
    public static void main(String[] args) {
//        A6 obj = new A6();
//        obj.print();

//        Drawable d = new Circle();
//        d.draw();
//        Drawable d2 = new Rectangle();
//        d2.draw();
//
//        A7 obj = new A7();
//        obj.print();
//        obj.show();

        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

/*
An interface in java is a blueprint of a class.
The interface in java is a mechanism to achieve abstraction.

why use java interface ?
it is used to achieve abstraction.
by interface, we can support the functionality of multiple inheritance.
it can be used to achieve coupling.
 */

interface Printable2{
    void print();
}

//class A6 implements Printable{
//    public void print(){
//        System.out.println("Hello");
//    }
//}

//
// interface declaration by first user.
interface Drawable{
    void draw();
}

//implementation by second user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}

/*
Multiple inheritance in java by interface
if a class implements multiple or an interface extends multiple interfaces
 */

interface Showable{
    void show();
}

class A7 implements Printable2,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}

// Q Multiple inheritance is not supported through class in java, but it is possible
//by an interface, why?
// it is bcz its implementation is provided by the implementation class.

// difference
interface A{
    void a();
    void b();
    void c();
    void d();
}

// creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }
}

// creating subclass of abstract class
class M extends B{
    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am b");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }
}