package lecture.OPP;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.insert(3,4);
        r1.calculateArea();
    }
}

class Rectangle {
    int length;
    int width;

    void insert(int l , int w) {length = l; width = w;};

    void calculateArea() {
        System.out.println("area : " + length * width);
    }
}