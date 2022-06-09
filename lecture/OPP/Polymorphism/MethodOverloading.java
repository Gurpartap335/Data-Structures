package lecture.OPP.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) { // JVM calls main() which receives string array as arguments only.
        // you can have any number of main methods in a class by method overloading.
        System.out.println("main with string");
//        System.out.println(Adder.add(34,33));
//        System.out.println(Adder.add(33,33,33));
//        System.out.println(Adder.add(12.3,34));
        OverloadingCalculation1 obj1 = new OverloadingCalculation1();
        obj1.sum(20,20);
        obj1.sum(20,20,20);
//        obj1.sum(2,2);

    }

//    public static void main() {
//        System.out.println("main without args");
//    }
}
// Method overloading
//if a class has multiple methods having same name but different in parameters
// it is known as Method overloading.
/*
if we have to perform only one operation, having same name of the methods increases the
readability of the program.

Two ways :
- by changing number of arguments
- by changing the data type
 */

class Adder{
    static int add(int a,int b) {
        return a + b;
    }

    static int add(int a,int b, int c) {
        return a + b;
    }

    static double add(double a,double b) {
        return a + b;
    }
    // In java, method overloading is not possible by changing the return type of
    // the method only because of ambiguity.
}

/*
    one type is promoted to another implicitly if no matching datatype is found.
    byte can be promoted short int long float double
    short -> int long float double
    char -> int long float double
 */

class OverloadingCalculation1{
    void sum(int a, long b) {
        System.out.println(a+b);
    }

    // compile time error
//    void sum(long a, int b) {
//        System.out.println(a+ b);
//    }
    // One type is not de-promoted implicitly for example
    // double cannot be de-promoted to any type implicitly.

    void sum(int a,int b,int c) {
        System.out.println(a + b + c);
    }
}
