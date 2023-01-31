package lecture.oop.singleton;

import lecture.oop.access.A;

public class Main {
    public static void main(String[] args) {
        A a = new A(34, "Tokia", new int[]{2,3, 3});
        System.out.println(a.getNum());

        Singleton o1 = Singleton.getInstance();
    }
}
