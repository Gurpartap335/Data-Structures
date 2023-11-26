package lecture.core.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human er = new Human(12, "Eren", 100000);
        System.out.println(Human.population);
        Human er2 = new Human(12, "Eren", 100000);
        System.out.println(Human.population);

    }

    // we know something which is not static, belongs to an object.

    static void fun() {
//        greeting(); you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you can't access non static stuff without referencing their instances
        // in a static context
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("Hello World");
    }
}
