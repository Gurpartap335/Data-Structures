package lecture.OPP;

public class OOP1 {
    public static void main(String[] args) {

    }

    // class is like an object constructor or blueprint for creating objects.
}

class Bicycle2 {
//     fields cadence speed gear represents the object's state
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // behavior-> methods
    // methods define its interaction with the outside world.
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
        System.out.println("cadence:" + cadence + "speed : " + speed + "gear:" + gear);
    }
}
/*
Object :
An object is a software bundle of related state and behavior.

Class :
A class is a blueprint or prototype from which objects are created.

Inheritance :
Inheritance provides a powerful and natural mechanism for organizing and structuring your software.

Interface
An interface is a contract between a class and the outside world.

Package:
Package is a namespace for organizing classes and interfaces in a logical manner.
Application Programming Interface(API).

The java platform provides an enormous class library (a set of packages)
known as API
 */
// objects
        /*
        Read world objects share two characteristics
        they all have state and behavior.
        Dogs state name color breed hungry
        behavior : barking fetching wagging tail

        methods(behavior) -> fields(state)

        laptop
        state color size
        behavior : processor

Bundling code into individual software objects provides number of benifits
Modularity
Information-hiding
code re-use
Pluggability and debugging ease

*/
/*
Exercise

state and behaviour
fields
methods
Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation

A collection of methods with no implementation is called an interface.



 */