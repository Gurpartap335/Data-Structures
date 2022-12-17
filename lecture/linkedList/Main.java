package lecture.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(12);
        list.insertFirst(43);
        list.insertLast(34);
        list.insertLast(22);
        list.insert(433, 3);

        list.display();

    }
}
