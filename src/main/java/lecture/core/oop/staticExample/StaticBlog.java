package lecture.core.oop.staticExample;

// https://www.freecodecamp.org/news/why-static-in-java-what-does-this-keyword-mean/
// https://stackoverflow.com/questions/2671496/when-to-use-static-methods
public class StaticBlog {
    public static void main(String[] args) {
        Car a = new Car();
        System.out.println(a.tyres);
    }
}

class Car{
    String color;
    String company;

    String carOil;

    static int tyres = 4;

    Car() {
        this.color = "Black";
        this.company = "BMW";
        this.carOil = "Petrol";
    }

    public Car(String color, String company, String carOil, int tyres) {
        this.color = color;
        this.company = company;
        this.carOil = carOil;
        this.tyres = tyres;
    }
}


class Student {
    String studentName;
    String course;
    static String school = "freeCodeCamp";

    public static void main(String[] args) {
        // two instances of student class
        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentName = "Eren";
        s1.course = "Data Visualization";

        s2.studentName = "mikasa";
        s2.course = "Java";

        display(s1);
        display(s2);

    }

    static void display(Student st) {
        System.out.println("Name " + st.studentName);
        System.out.println("Course " + st.course);
        System.out.println("School " + school);
    }

}


class EvenNumber {
    static int evenNumber;

    int notEvenNumberSadly;

    static void incrementBy2() {
        evenNumber += 2;
        System.out.println(evenNumber);
    }

    void incrementBy1() {
        notEvenNumberSadly += 1;
        System.out.println(notEvenNumberSadly);
    }
    public static void main(String[] args) {
        System.out.println(evenNumber);
        incrementBy2();
        incrementBy2();
        incrementBy2();
        EvenNumber.incrementBy2(); // every static method belongs to the class and not instances of the class.


    }
}
/**
 * The main purpose of using the static keyword in java is to save memory.
 *
 * static methods-
 * static methods can only access and modify static variables.
 * static methods can be called without creating a class instance.
 *
 * The process of selecting essential/relevant information is called abstraction.
 */

class Block {
    static int year;

    // static blocks are executed by the compiler before the main method.
    static {
        year = 2022;
        System.out.println("This code block got executed first");
    }

    static {
        System.out.println("Yoo");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(year);
    }

    static {
        System.out.println("Static Block always executed first by compilers.");
    }
}


class StaticBlock {
    static int a = 4;
    static int b;


    static {
        System.out.println("I am in static block");
        b = 34;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }


}