package lecture.core.oop.four;

// Cat class that represents states and behaviour of real world cat.
public class Cat {

    // instance or member variables
    String name;
    int age;
    String color;
    String breed;

    public Cat(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public Cat() {
//        name = "stark";
//        age = 4;
//        color = "Red";
//        breed = "orange";
    }


    // instance methods
    void sleep() {
        System.out.println("Sleeping");
    }

    void play() {
        System.out.println(this.name + " Playing");
    }

    void playWithName(String name) {
        System.out.println(name + " playing");
    }

    void playName(Cat c) {
        System.out.println(c.name + " Playing");
        System.out.println(this.name + " Playing");
    }

    void feed() {
        System.out.println("Eating");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age: " + age);
        System.out.println("Color : " + color);
        System.out.println("Breed : " + breed);
    }

}

class Main {
    public static void main(String[] args) {
        Cat thor = new Cat();
        Cat rambo = new Cat("Rombo", 5, "Black", "Orange");

        thor.display();
        thor.age = 3;
        thor.name = "Thor";
        thor.breed = "Russian Blue";
        thor.color = "White";
        thor.display();

        thor.sleep();
        rambo.play();

        Cat stark = new Cat();
        stark = new Cat("Stark", 10, "Red", "Orange");
        System.out.println(stark.name);
        stark.play();

        stark.playWithName(stark.name);
        stark.playName(stark);
    }
}