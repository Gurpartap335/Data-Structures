package lecture.OPP.Encapsulation;

public class Package {
    public static void main(String[] args) {
        A obj = new A();
//        System.out.println(obj.data); compile time error.
    }
}
/*
A java package is a group of similar types of classes, interfaces and sub-packages.
two forms
- built-in package java lang awt javax swing net io util sql
- user-defined package
 */

class A{
    private int data = 40;
    private void msg() {
        System.out.println("dfg");
    }
}

// protected
