package lecture.core.oop.interfaceDemo;

// https://medium.com/geekculture/why-do-we-need-interfaces-in-java-9a95ef57a156

class Duck implements Drawable, Countable{
    private int size;

    private String color;

    private String name;

    public Duck(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void fly() {
        System.out.println("Duck is flying");
    }

    public void eat() {
        System.out.println("Duck is eating");
    }

    public void draw() {
        System.out.println("I drew a duck");
    }



    public void count() {
        System.out.println("I have 2 duck");
    }

}

class BabyDuck implements Movable{
    public void swim() {
        System.out.println("I can swim");
    }

    public void fly() {
        System.out.println("I am learning to fly");
    }
}

// The use of interfaces allows us to avoid tight coupling.
class GrownDuck implements Movable{
    public void swim() {
        System.out.println("I can swim");
    }

    public void fly() {
        System.out.println("I can fly");
    }
}

class NewDuck {
    private BabyDuck babyDuck;

    private GrownDuck grownDuck;

    public NewDuck(BabyDuck babyDuck) {
        this.babyDuck = babyDuck;
    }

    public NewDuck(GrownDuck grownDuck) {
        this.grownDuck = grownDuck;
    }
    public void move() {
        babyDuck.fly();
        babyDuck.swim();
    }

    public void move2() {
        grownDuck.fly();
        grownDuck.swim();
    }
}

/**
 * The use of interfaces allow classes to have functionalities that might not
 * logically belong to them. (abstraction)
 * The use of interfaces us to have multiple inheritance.
 * To enable classes to have behaviour that does not belong to them.
 * To have loose coupling.
 */
public class Main {
    public static void main(String[] args) {
        BabyDuck hatch = new BabyDuck();
        NewDuck myDuck = new NewDuck(hatch);
        myDuck.move();

        GrownDuck zora = new GrownDuck();
        NewDuck newDuck = new NewDuck(zora);
        newDuck.move2();
    }
}

interface Drawable {
    void draw();
}

interface Countable {
    static int a = 56;
    void count();
}

interface Movable {
    void swim();
    void fly();
}

