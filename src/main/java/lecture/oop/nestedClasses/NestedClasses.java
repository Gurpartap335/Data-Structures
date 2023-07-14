package lecture.oop.nestedClasses;

/**
 * Nested classes can of two types
 *  one with static keyboard -> static nested classes
 *  other without static keyboard -> inner classes
 */
public class NestedClasses {

    String outerField = "Outer field";
    static String staticOuterFiled = "Static Outer field";


    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterFiled);
        }
    }

    static class StaticNestedClass {

        void accessMembers(NestedClasses nest) {
            System.out.println(nest.outerField);
            System.out.println(staticOuterFiled);
        }
    }

    public static void main(String[] args) {
        NestedClasses nestedClasses = new NestedClasses();
        NestedClasses.InnerClass innerClass = nestedClasses.new InnerClass();
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        System.out.println(NestedClasses.staticOuterFiled);
        innerClass.accessMembers();
        staticNestedClass.accessMembers(nestedClasses);
    }
}



class LocalClass {

    public void method() {

        class InnerLocalClass {
            public void method() {
                System.out.println("A");
            }

        }

        System.out.println("B");
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();

    }
}