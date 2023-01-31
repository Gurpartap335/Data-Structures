package lecture.oop.staticExample;

public class InnerClass {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Eren");
        Test b = new Test("Mikasa");
        System.out.println(a);

    }
}
