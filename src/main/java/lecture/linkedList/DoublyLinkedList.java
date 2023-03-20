package lecture.linkedList;

public class DoublyLinkedList<E> {
    private Node head;

    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }
    public void insertFirst(E value) {
        Node node = new Node(value);
        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            size++;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(E value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = get(size - 1);
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void removeFirst() {
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next.prev = null;
        size--;
    }

    public void removeLast() {
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = get(size - 2);
        temp.next = null;
        size--;
    }

    public void insert(E value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = get(index - 1);
        Node temp2 = get(index);
        temp.next = node;
        node.prev = temp;
        node.next = temp2;
        temp2.prev = node;
        size++;

    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size) {

        }

        Node temp = get(index - 1);
        temp.next = temp.next.next;

        Node temp2 = get(index);
        temp2.prev = temp;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayBackwards() {
        Node temp = get(size - 1);

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("END");

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void clearList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    private class Node {
        private E value;

        private Node prev;

        private Node next;

        public Node(E value) {
            this.value = value;
        }

        public Node(Node next) {
            this.next = next;
        }
        public Node(E value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();



        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        list.insert(34, 2);
        list.display();
        list.insert(23, 2);
        list.display();
        list.remove(3);
        list.display();
        list.remove(2);
        list.display();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.display();
//        list.removeFirst();
//        list.display();

//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.display();
//        list.removeLast();
//        list.display();
        list.clearList();
        list.display();
        list.displayBackwards();

    }
}
