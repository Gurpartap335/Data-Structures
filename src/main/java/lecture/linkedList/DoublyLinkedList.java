package lecture.linkedList;


public class DoublyLinkedList<E> {
    private Node head;

    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public void insertFirst(E value) {
        Node node = new Node(value, null, null);
        if (head == null) {
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

    public void add(E value) {
        insertLast(value);
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("No element to remove");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("No element to remove");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = get(size - 2);
        Node lastNode = temp.next;
        lastNode.prev = null;
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

        Node first = get(index - 1);
        Node second = first.next;
        first.next = node;
        node.prev = first;
        node.next = second;
        second.prev = node;
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }
        Node first = get(index - 1);
        Node second = first.next;
        Node third = second.next;
        first.next = third;
        third.prev = first;
        second = null;
//        second.next = null;
//        second.prev = null;
//        second.value = null;
        size--;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
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
        System.out.println("null");
    }

    public void displayBackwards() {
        Node temp = get(size - 1);

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void clearList() {
        Node current = head;
        while (current != null) {
            Node prev = current;
            current = current.next;
            prev.next = null;
            prev.prev = null;
            System.out.println(prev.value);
            prev.value = null;
        }
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

    }
}
