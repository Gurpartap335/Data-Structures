package lecture.core.oop.staticExample;

public class InnerClass {

    private static int a = 10;
    static class Test {
        private String name;

        public Test() {
            System.out.println(a);
        }
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    class Nested{
        int a = 12;
        int b = 23;

        public Nested() {
            System.out.println("Object is created");
        }
    }

    public static void main(String[] args) {
        Test a = new Test();
    }
}

class OuterClass {

    int outerNumber = 23;

    public OuterClass() {
        System.out.println(outerNumber);

        class LocalInnerClass {
            String localInnerClassVariable = "Yo mister white";
            LocalInnerClass() {
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass i = new LocalInnerClass();
    }
    static class InnerClass {
        int innerClassNumber = 12;

        public InnerClass(){
            System.out.println(innerClassNumber);
        }
    }

    class White {
        String name = "Skylar";

        White() {
            System.out.println("Yo");
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        InnerClass innerObject = new InnerClass();
        System.out.println(innerObject.innerClassNumber);

        OuterClass.White obj1 = outerObject.new White();

    }
}

