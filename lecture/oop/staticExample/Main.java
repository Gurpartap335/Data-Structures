package lecture.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human er = new Human(12, "Eren", 100000);
        System.out.println(Human.population);
        Human er2 = new Human(12, "Eren", 100000);
        System.out.println(Human.population);

    }
}
