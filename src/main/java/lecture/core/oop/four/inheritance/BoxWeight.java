package lecture.core.oop.four.inheritance;

public class BoxWeight extends Box{
    private double weight;

    public BoxWeight() {
        weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public void display() {
        System.out.println("weight : " + weight);
    }

}
