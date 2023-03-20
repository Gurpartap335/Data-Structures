package lecture.oop.genrics.comparing;

public class Student implements Comparable<Student> {
    private int rollNo;
    private float marks;

    public Student(int rollNo, float marks){
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
