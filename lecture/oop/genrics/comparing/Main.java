package lecture.oop.genrics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student random1 = new Student(12, 12334.3f);
        Student random2 = new Student(23, 8449.32f);

        if (random1.compareTo(random2) < 0) {
            System.out.println(random1.compareTo(random2));
            System.out.println("random2 has more marks");
        }
    }
}
