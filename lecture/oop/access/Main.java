package lecture.oop.access;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A a = new A(34, "Zora", new int[]{1, 2, 3});

        int ans = a.getNum();
        System.out.println(ans);
        System.out.println(a.getNum());
        a.setNum(10000);
        System.out.println(a.getNum());

        System.out.println(Arrays.toString(a.getArr()));
        a.setArr(new int[]{3, 4, 5, 6});
        System.out.println(Arrays.toString(a.getArr()));

        System.out.println(a.getName());
        a.setName("Ely");
        System.out.println(a.getName());

    }
}
