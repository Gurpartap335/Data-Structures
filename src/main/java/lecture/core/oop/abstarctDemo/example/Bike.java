package lecture.core.oop.abstarctDemo.example;

public abstract class Bike {

    Bike() {
        System.out.println("Bike is created");
    }
    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}

class Honda extends Bike {

    @Override
    void run() {
        System.out.println("Running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();

        Honda honda = new Honda();
        honda.run();

        honda.changeGear();

    }
}
