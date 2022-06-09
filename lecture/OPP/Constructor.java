package lecture.OPP;

public class Constructor {
    public static void main(String[] args)  {
        Bike1 b = new Bike1();

        Student1 s1 = new Student1(111,"karan");
        Student1 s2 = new Student1(34,"fd");

        s1.display();

        s2.display();

        Student1 s3 = new Student1(1,"er", 18);
        s3.display();
    }
}
/*
Constructor in java
It is called constructor because it constructs the values at the time of object
creation.
Java compiler creates a default constructor if your class does not have any.

Default constructor
a constructor is called default constructor when it does not have any parameter.
 */

class Bike1 {
    Bike1() {
        System.out.println("Bike is created");
    }
    /*
    if there is no constructor in class, compiler automatically creates a default constructor.
     */
}

/*
Parameterized constructor:
a constructor which has a specific number of parameters is called a
parameterized constructor.
 */

class Student1{
    int id;
    String name;
    int age;

    // creating a parameterized constructor
    Student1(int i,String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Student1(int i,String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
