package lecture.oop.introduction;

public class Main {
    public static void main(String[] args) {
        // Create a data type that store five roll numbers
        Student st1 = new Student();
        st1.display();
        st1.changeName("eren yeager");
        st1.display();

        Student st2 = new Student(st1);
        st2.display();

    }

}

class Student {
    int rollNumber;
    String name;
    float marks;

    Student () {
        this.rollNumber = 1;
        this.name = "Hitagi";
        this.marks = 45.54f;
    }

    Student (Student other) {
        this.rollNumber = other.rollNumber;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student (int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }

    void changeName(String name) {
        this.name = name;
    }

    void greeting() {
        System.out.println("Hello, " + name);
    }
}

/**
 * Class: Logical Constant
 * Object: physical reality // occupies space in memory
 *
 * Reference variable stores the memory address of an object created on heap.
 * Objects are data allocated on the heap
 * reference are addresses of objects.
 *
 * Instance variable variables that are declared inside the class.
 * new : dynamic memory allocation
 * stack and heap memory
 * */

// https://java2blog.com/reference-variable-java/#:~:text=If%20the%20type%20is%20an,because%20String%20is%20a%20class.

// if the type is an object then the variable is reference variable.
// if the variable holds primitive types then non-reference variable
class ReferenceVariable {
    public static void main(String[] args) {
        String str = "Choujin X";
        ReferenceVariable r = new ReferenceVariable();
        System.out.println(r);
        int a = 10; // non-reference variable

        Object object = new Object();
        System.out.println(object);
    }

}