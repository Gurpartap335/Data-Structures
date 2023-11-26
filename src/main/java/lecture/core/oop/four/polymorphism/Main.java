package lecture.core.oop.four.polymorphism;

public class Main {
    public static void main(String[] args) {
         Shapes s = new Shapes();
         Shapes s1 = new Circle();
         Circle c = new Circle();
         s.area(); // shapes
         s1.area(); // Circle
         c.area(); // Circle

        Square square = new Square();
        square.area();
        Triangle triangle = new Triangle();
        triangle.area();
    }
}
/**
 * Compile Time/ Static Polymorphism
 * achieved via method overloading.
 *
 * Runtime/ Dynamic Polymorphism
 * achieved by method overriding
 */
