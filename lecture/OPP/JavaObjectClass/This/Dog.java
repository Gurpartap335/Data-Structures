package lecture.OPP.JavaObjectClass.This;

// public class can be accessed form anywhere.
public class Dog {
    String name;
    int age;

    Dog() {
        this("Fido",0);
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
