package lecture.core.oop.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);

        final int d = 343;

        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("raaaaaaaaaaa");
        }
    }

     static void swap(int a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

// pass by value
// final keyword primitive non-primitive
// garbage collection automatic