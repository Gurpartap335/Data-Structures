package leetcode.linkedList;

// https://leetcode.com/problems/design-linked-list/description/

public class DesignLinkedList {

    private Node head;

    private Node tail;

    private int size;

    public DesignLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    // get the value of the index node
    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            addAtHead(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            System.out.println("Index out bound");
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteAtHead() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteAtTail() {
        Node temp = head;
        for (int i = 1; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index > size) {
            System.out.println("Index out bound");
            return;
        }

        if (index == 0) {
            deleteAtHead();
            return;
        }

        if (index == size - 1) {
            deleteAtTail();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next; // reference to the next node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DesignLinkedList list = new DesignLinkedList();
        list.display();
        list.addAtHead(9);
        list.addAtHead(3);
        list.addAtHead(5);
        list.addAtTail(1);
        list.addAtTail(3);
        list.addAtTail(23);
        list.display();
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        System.out.println(list.get(6));
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
        list.addAtIndex(4, 99);
        list.display();
        list.addAtIndex(0, 101);
        list.display();
        list.addAtIndex(2, 2322);
        list.display();
        list.deleteAtIndex(2);
        list.deleteAtIndex(0);
        list.display();
//        System.out.println(list.size);
//        System.out.println(list.getSize());
        list.deleteAtTail();
        list.deleteAtHead();
        list.display();
        list.addAtHead(5);
        list.addAtTail(23);
        list.display();

    }

}
