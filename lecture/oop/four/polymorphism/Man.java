package lecture.oop.four.polymorphism;

// https://medium.com/@anna-scott/polymorphism-and-inheritance-in-object-oriented-programing-or-shapeshifting-of-instantiated-3f19dd30ab60
public class Man {
    private int numberOfLegs;
    private String colorOfCoat;
    private boolean hasArms;

    public Man(int numberOfLegs, String colorOfCoat, boolean hasArms) {
        this.numberOfLegs = numberOfLegs;
        this.colorOfCoat = colorOfCoat;
        this.hasArms = hasArms;
    }

    @Override
    public String toString() {
        return "Man{" +
                "numberOfLegs=" + numberOfLegs +
                ", colorOfCoat='" + colorOfCoat + '\'' +
                ", hasArms=" + hasArms +
                '}';
    }
}
