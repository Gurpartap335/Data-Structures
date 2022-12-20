package lecture.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(11);
        list.insertLast(13);
        list.display();
        list.delete(3);
        list.display();
        System.out.println(list.find(11));
    }
}

/**
 * Visualize what to do
 */