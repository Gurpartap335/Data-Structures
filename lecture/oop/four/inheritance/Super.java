package lecture.oop.four.inheritance;

/**
 * The super keyboard in java is a reference variable which is used to refer immediate
 * parent class object.
 *
 * super can be used to refer immediate parent class instance variable.
 * super can be used to invoke immediate parent class method.
 * super() can be used to invoke immediate parent class constructor.
 *
 * super() is added in each class constructor automatically by compiler if there
 * is no super() or this()?
 *
 * Default constructor?
 */
public class Super {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog.color);
//        Animal ani = new Animal();
//        System.out.println(ani.color);
//        dog.printColor();
//        dog.eat();

//        Chair chair = new Chair();
        Emp emp = new Emp();
        emp.display();

        Emp emp1 = new Emp(1, "Cena", 340000);
        emp1.display();


    }
}

class Animal {
    String color = "white";

    Animal() {
        color = "Orange";
        System.out.println("Animal is created..");
    }

    Animal(String color) {
        this.color = color;
    }
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        super();
        System.out.println("Dog is created");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat() {
        System.out.println("eating bread");
        super.eat();
    }

}

class Table {
    Table() {
        System.out.println("Table is created");
    }
}

class Chair extends Table {
    Chair() {
        System.out.println("Chair is created");
    }
}

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    Emp() {
        super(34, "John"); // reusing parent constructor
        salary = 34;
    }
    Emp (int id, String name, float salary) {
        super(id, name); // reusing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}