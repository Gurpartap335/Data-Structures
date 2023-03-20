package lecture.oop.four.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    BoxPrice() {
        super();
        this.cost = -1;
    }

//    public BoxPrice(BoxPrice other) {
//        super(other);
//        this.cost = other.cost;
//    }

}
