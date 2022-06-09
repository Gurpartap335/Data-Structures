package lecture.OPP;

public class Intro {
    // defining fields
    int id;
    String name;
    public static void main(String[] args) {
        Intro i1 = new Intro(); // creating an object.
        System.out.println(i1.id + " " + i1.name); // printing the values of object.
    }
}

/*
The main aim of object-oriented programming is to implement real world entities
for example object classes abstraction inheritance polymorphism

object means real world entity such as a pen chair table

object class inheritance polymorphism abstraction encapsulation

object -> instance of a class. An object contains an address and takes up some space in memory.
Physical as well as a logical entity.

Collection of objects is called class. it is logical entity.
A variable which is created inside the class but outside the method known as
an instance. It gets memory at runtime when an object or INSTANCE is created.

Inheritance : When an object acquires all the properties and behaviors of a parent object.

Polymorphism:
one task is performed in different ways.

Abstraction Hiding internal details and showing functionality is known as abstraction.

Naming Convention :

Package: it should be a lowercase letter
If the name contains multiple words it should be separated by dots(.)
java.util java.lang.

Constant Uppercase letters and separated by _
MIN_AGE

CamalCase class interface method variable
 */

/*
3 ways to initialize object
1. By reference variable
2. By method
3. By constructor
 */

/*
Compile-time is the time at which the source code is converted into an executable
code
runtime is the time at which the executable code is started running.

new keyboard is used to allocate memory at runtime.
All objects get memory in Heap memory area.
 */
