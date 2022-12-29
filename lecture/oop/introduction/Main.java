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