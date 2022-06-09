package lecture.OPP.JavaObjectClass;

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(1,"ef",2343f);
        s1.display();

        A a = new A();
        a.n();
    }
}
/*
In Java,this is a reference variable that refers to the current object.
 */

// this; to refer current class instance variable

class Student{
    int rollNo;
    String name;
    float fee;
    Student (int rollNo, String name,float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + fee);
    }
}

//class Student{
//    int rollNo;
//    String name;
//    float fee;
//    Student (int r, String n,float f) {
//        rollNo = r;
//        name = n;
//        fee = f;
//    }
//
//    void display() {
//        System.out.println(rollNo + " " + name + " " + fee);
//    }
//}


// this: to invoke current class method
class A{
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        this.m();
    }
}

// this keyword can be used to return current class instance.