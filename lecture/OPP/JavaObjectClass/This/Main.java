package lecture.OPP.JavaObjectClass.This;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        d1.setName("Rocky");
        d1.setAge(5);

        System.out.println(d1.getName());
        System.out.println(d1.getAge());
    }
}
/*
There can be a lot of usage of java this keyword.
In java, this is a reference variable that refers to the current object.
 */

// reference variable
