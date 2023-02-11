package lecture.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(12);
        list.insertFirst(34);
        list.insertFirst(23);
        list.display();
        list.insert(1, 1);
        list.display();
//        System.out.println(list.find(344));
//        System.out.println(list.find(12));
        System.out.println(list.get(3));
        System.out.println(list.getSize());
    }
}

/**
 * Visualize what to do
 */