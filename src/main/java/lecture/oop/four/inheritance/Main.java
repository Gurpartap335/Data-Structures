package lecture.oop.four.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.information();
        box.display();

        box = new Box(23, 10, 2);
        box.display();

        BoxWeight box2 = new BoxWeight();

    }
}
