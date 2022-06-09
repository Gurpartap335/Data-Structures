package lecture.OPP.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();

        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();
        System.out.println("Rate of interest : " + s.getRateOfInterest());
        System.out.println("Rate of interest : " + i.getRateOfInterest());
        System.out.println("Rate of interest : " + a.getRateOfInterest());
    }
}
// Method overriding
/*
If subclass (child class) has the same method as declared in the parent class
it is known as method overriding in java.
 */

class Vehicle {
    void run() {
        System.out.println("vehicle is running");
    }
}

class Bike2 extends Vehicle{
    // defining the same method as in the parent class.
    void run() {
        System.out.println("Bike is running safely.");
    }
}

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest() {
        return 8;
    }
}

class ICIC extends Bank{
    int getRateOfInterest() {
        return 4;
    }
}

class AXIS extends Bank{
    int getRateOfInterest() {
        return 9;
    }
}