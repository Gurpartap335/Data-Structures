package lecture.oop.abstarctDemo;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("I am : Programmer");
    }

    @Override
    void age(int age) {
        System.out.println("My age is : " + age);
    }

    static void hello() {
        System.out.println("Hello");
    }
}
