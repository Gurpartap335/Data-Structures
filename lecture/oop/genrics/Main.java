package lecture.oop.genrics;

public class Main implements GenericInterface<Integer> {
    @Override
    public void display(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display(123);
    }
}
