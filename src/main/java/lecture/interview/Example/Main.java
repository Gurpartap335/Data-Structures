package lecture.interview.Example;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Phone user = new Phone();
        user.setBrand("iPhone");
        user.setColor("Black");
        user.setModel("15");
        user.setPrices(34000);
        user.printPhoneDetails();

        Phone user1 = new Phone();
        user1.printPhoneDetails();

        Phone user2 = new Phone("Black", "Samsung", "Galaxy A14", 19999);
        user2.printPhoneDetails();
    }

}
