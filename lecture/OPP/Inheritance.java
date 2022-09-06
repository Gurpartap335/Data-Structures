package lecture.OPP;

public class Inheritance {
    public static void main(String[] args) {
//        Programmer p = new Programmer();
//        System.out.println("Programmer salary is: " + p.salary);
//        System.out.println("Programmer bonus is : " + p.bonus);

        // simple inheritance
        Dog d = new Dog();
//        d.eat();
//        d.bark();

        // multilevel inheritance
        BabyDog d1 = new BabyDog();
        d1.eat();
        d1.bark();
        d1.weep();

        // hierarchical inheritance
        Cat c = new Cat();
        c.meow();
        c.eat();

    }
}

/*
Inheritance is java is a mechanism in which object acquires all the properties and
behaviours of a parent object.
INHERIT
Inheritance represents the IS-A relationship which is also known as parent-child
relationship.
 */

/*
class subclass-name extends superclass-name {
   // methods and fields
}
 */

class Employee2{
    float salary = 34543.2343f;
}

class Programmer extends Employee2{
    int bonus = 10000;
}

/*
Types of inheritance in java
single
multilevel
hierarchical

Multiple inheritance is not supported in java through class.
 */

// single inheritance
class Animal {
    void eat() {
        System.out.println("eating..");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking ...");
    }
}

// multilevel inheritance
// when there is a chain of inheritance

class BabyDog extends Dog{
    void weep() {
        System.out.println("weeping ..");
    }
}

//Hierarchical inheritance
// when two or more classes inherits a single class

class Cat extends Animal {
    void meow() {
        System.out.println("meowing ..");
    }
}

// why multiple inheritance is not supported in java?
/*
if two class which are inherited have same method then you called it from child
class object, there will be ambiguity to call the method.

compile time errors are better than runtime errors so java renders compile time error
if you inherit 2 classes.
so whether you have same method or different, there will be compile time error.
 */