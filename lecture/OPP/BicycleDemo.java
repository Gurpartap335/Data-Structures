package lecture.OPP;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(); // created a object
        Bicycle bike2 = new Bicycle(); // created another object of type bicycle

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.applyBrakes(5);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(33);
        bike2.applyBrakes(3);
        bike2.changeGear(33);
        bike2.speedUp(1111);
        bike1.printStates();
    }

}
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
class MountainBike {
    // new fields and methods defining a mountain bike would go here
}

//public interface Bicycle {
//
//    //  wheel revolutions per minute
//    void changeCadence(int newValue);
//
//    void changeGear(int newValue);
//
//    void speedUp(int increment);
//
//    void applyBrakes(int decrement);
//}

//public class ACMEBicycle {
//
//    int cadence = 0;
//    int speed = 0;
//    int gear = 1;
//
//    // The compiler will now require that methods
//    // changeCadence, changeGear, speedUp, and applyBrakes
//    // all be implemented. Compilation will fail if those
//    // methods are missing from this class.
//
//    void changeCadence(int newValue) {
//        cadence = newValue;
//    }
//
//    void changeGear(int newValue) {
//        gear = newValue;
//    }
//
//    void speedUp(int increment) {
//        speed = speed + increment;
//    }
//
//    void applyBrakes(int decrement) {
//        speed = speed - decrement;
//    }
//
//    void printStates() {
//        System.out.println("cadence:" +
//                cadence + " speed:" +
//                speed + " gear:" + gear);
//    }
//}

class Bicycle11 {

}