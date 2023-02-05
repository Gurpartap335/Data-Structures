package lecture.oop.four.polymorphism;

public class Fox extends Man{
    private String tail;

    public Fox(int numberOfLegs, String colorOfCoat, boolean hasArms, String tail) {
        super(numberOfLegs, colorOfCoat, hasArms);
        this.tail = tail;
    }
}

class Main2 {
    public static void main(String[] args) {
        Fox fox = new Fox(4, "red", false, "bushy");
        Man manFox = fox;
        Object objectFox = fox;

        Man man = new Man(2, "red", true);

        System.out.println(fox);
        System.out.println(manFox);
        System.out.println(objectFox);
        System.out.println(man);
    }
}