package lecture.oop.singleton;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        return instance;
    }
}
