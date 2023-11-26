package lecture.core.oop.abstarctDemo;

public class Son extends Parent {

    @Override
    void career() {
        System.out.println("I want to be : Doctor");
    }

    @Override
    void age(int age) {
        System.out.println("My age is " + age);
    }
}
