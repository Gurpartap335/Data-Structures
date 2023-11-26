package lecture.core.oop.access;

public class A {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int[] getArr() {
        return arr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}
