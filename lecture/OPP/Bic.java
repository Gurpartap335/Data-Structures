package lecture.OPP;

import java.awt.*;

public class Bic {
    public static void main(String[] args) {


    }

}

/*
modifiers ClassName {}
 */
class Car {
    int speed;
    int gear;
    int cadence;
    String name;

    public Car(int startSpeed, int startGear, int startCadence) {
        speed = startSpeed;
        gear = startGear;
        cadence = startCadence;
    }

    public void setSpeed(int newValue) {
        speed = newValue;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public int getCadence() {
        return cadence;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}


// Passing information to a method or a constructor
/*
Parameters refers to the list of variables in a method declaration
Arguments are the actual values that are passed in when the method is invoked
 */
