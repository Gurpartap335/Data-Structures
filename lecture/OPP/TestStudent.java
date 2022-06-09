package lecture.OPP;

public class TestStudent {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.id = 12;
//        s1.name = "Gurpartap Singh";
//        System.out.println(s1.id + " " + s1.name);
//
//        Student s2 = new Student();
//        s2.id = 34;
//        s2.name = "moosetape";
//        System.out.println(s2.id + " " + s2.name);

        Student2 guri = new Student2();
        guri.setName("Gurpartap Singh");
        guri.setRollNo(34);
        guri.displayInformation();
    }
}

class Student {
    int id;
    String name;
}

class Student2 {
    int rollNo;
    String name;

    void setRollNo(int newValue) {
        rollNo = newValue;
    }

    void setName(String newValue) {
        name = newValue;
    }

    void displayInformation() {
        System.out.println("Roll no : " + rollNo + " " + "Name " +  name);
    }
}
