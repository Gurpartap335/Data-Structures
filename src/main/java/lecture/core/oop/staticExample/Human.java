package lecture.core.oop.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population = 700000000;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        population += 1;
    }
}
